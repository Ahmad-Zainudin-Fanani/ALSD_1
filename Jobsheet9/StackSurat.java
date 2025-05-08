package Jobsheet9;

public class StackSurat {
    Surat02[] data;
    int top;
    int kapasitas = 100;

    public StackSurat() {
        data = new Surat02[kapasitas];
        top = -1;
    }

    public void push(Surat02 surat) {
        if (top < kapasitas - 1) {
            top++;
            data[top] = surat;
        } else {
            System.out.println("Stack penuh.");
        }
    }

    public Surat02 pop() {
        if (!isEmpty()) {
            Surat02 s = data[top];
            top--;
            return s;
        }
        return null;
    }

    public Surat02 peek() {
        if (!isEmpty()) {
            return data[top];
        }
        return null;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void prosesSurat() {
        Surat02 surat = pop();
        if (surat != null) {
            System.out.println("Surat atas nama " + surat.namaMahasiswa + " telah diproses.");
        } else {
            System.out.println("Tidak ada surat untuk diproses.");
        }
    }

    public void lihatSuratTerakhir() {
        Surat02 surat = peek();
        if (surat != null) {
            System.out.println("Surat Terakhir:");
            tampilkan(surat);
        } else {
            System.out.println("Tidak ada surat.");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (data[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                tampilkan(data[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat tidak ditemukan.");
        }
    }

    private void tampilkan(Surat02 surat) {
        System.out.println("ID Surat   : " + surat.idSurat);
        System.out.println("Nama       : " + surat.namaMahasiswa);
        System.out.println("Kelas      : " + surat.kelas);
        System.out.println("Jenis Izin : " + surat.jenisIzin);
        System.out.println("Durasi     : " + surat.durasi + " hari");
    }
}
