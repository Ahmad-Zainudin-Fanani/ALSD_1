package Jobsheet7;

import java.util.Scanner;

public class DemoDosen02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DataDosen02 daftarDosen = new DataDosen02();

        daftarDosen.tambah(new Dosen02("D1", "Andi", true, 28));
        daftarDosen.tambah(new Dosen02("D2", "Bella", false, 34));
        daftarDosen.tambah(new Dosen02("D3", "Cindy", false, 31));
        daftarDosen.tambah(new Dosen02("D4", "Dodi", true, 37));
        daftarDosen.tambah(new Dosen02("D5", "Eko", true, 45));
        daftarDosen.tambah(new Dosen02("D6", "Fira", false, 26));
        daftarDosen.tambah(new Dosen02("D7", "Galih", true, 33));
        daftarDosen.tambah(new Dosen02("D8", "Hilda", false, 29));
        daftarDosen.tambah(new Dosen02("D9", "Indra", true, 35));
        daftarDosen.tambah(new Dosen02("D10", "Jeni", false, 30));

        System.out.println("== Data Dosen Sebelum Sorting ==");
        daftarDosen.tampil();

        System.out.println("== Sorting Usia Naik (Muda ke Tua) ==");
        daftarDosen.sortingASC();
        daftarDosen.tampil();

        System.out.println("== Sorting Usia Turun (Tua ke Muda) ==");
        daftarDosen.sortingDESC();
        daftarDosen.tampil();

        System.out.print("Masukkan usia yang ingin dicari: ");
        int targetUmur = scanner.nextInt();
        daftarDosen.sortingASC();
        int posisiUmur = daftarDosen.pencarianDataBinary(targetUmur, 0, daftarDosen.idx - 1);
        daftarDosen.tampilDataSearch(posisiUmur);
        daftarDosen.cekDuplikatUsia(posisiUmur);

        System.out.print("Masukkan nama yang ingin dicari: ");
        String targetNama = scanner.next();
        int[] hasilCari = daftarDosen.pencarianDataSequential(targetNama);
        daftarDosen.tampilDataSearch(hasilCari[0]);
        daftarDosen.cekDuplikatNama(hasilCari[1], targetNama);
    }
}
