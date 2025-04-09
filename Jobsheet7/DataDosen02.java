package Jobsheet7;

public class DataDosen02 {
    public Dosen02[] data = new Dosen02[10];
    public int idx = 0;

    public void tambah(Dosen02 dosen) {
        if (idx < data.length) {
            data[idx++] = dosen;
        } else {
            System.out.println("Kapasitas data penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            data[i].tampil();
        }
        System.out.println("----------------------------------");
    }

    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (data[j].umur > data[j + 1].umur) {
                    Dosen02 tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
        }
    }

    public void sortingDESC() {
        for (int i = 0; i < idx - 1; i++) {
            int posisiMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (data[j].umur > data[posisiMax].umur) {
                    posisiMax = j;
                }
            }
            Dosen02 tmp = data[i];
            data[i] = data[posisiMax];
            data[posisiMax] = tmp;
        }
    }

    public int[] pencarianDataSequential(String namaCari) {
        int posisiTerakhir = -1;
        int totalDitemukan = 0;

        for (int i = 0; i < idx; i++) {
            if (data[i].nama.equalsIgnoreCase(namaCari)) {
                posisiTerakhir = i;
                totalDitemukan++;
            }
        }

        return new int[]{posisiTerakhir, totalDitemukan};
    }

    public int pencarianDataBinary(int usia, int kiri, int kanan) {
        if (kanan >= kiri) {
            int tengah = (kiri + kanan) / 2;

            if (data[tengah].umur == usia) {
                return tengah;
            } else if (data[tengah].umur > usia) {
                return pencarianDataBinary(usia, kiri, tengah - 1);
            } else {
                return pencarianDataBinary(usia, tengah + 1, kanan);
            }
        }
        return -1;
    }

    public void tampilDataSearch(int posisi) {
        if (posisi != -1) {
            System.out.println(">> Data ditemukan:");
            data[posisi].tampil();
        } else {
            System.out.println(">> Data tidak ditemukan.");
        }
    }

    public void cekDuplikatUsia(int posisi) {
        if (posisi == -1) return;

        int umurDicari = data[posisi].umur;
        boolean ditemukan = false;

        if (posisi > 0 && data[posisi - 1].umur == umurDicari) {
            ditemukan = true;
        }
        if (posisi < idx - 1 && data[posisi + 1].umur == umurDicari) {
            ditemukan = true;
        }

        if (ditemukan) {
            System.out.println("!!! Ada lebih dari satu dosen dengan umur " + umurDicari);
        }
    }

    public void cekDuplikatNama(int totalNama, String nama) {
        if (totalNama > 1) {
            System.out.println("!!! Nama \"" + nama + "\" muncul lebih dari sekali.");
        }
    }
}