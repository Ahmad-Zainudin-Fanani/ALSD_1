package Jobsheet9;

import java.util.Scanner;

public class StackDemo02 {
    public static void main(String[] args) {
        StackSurat stack = new StackSurat();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();

                    stack.push(new Surat02(id, nama, kelas, jenis, durasi));
                    break;

                case 2:
                    stack.prosesSurat();
                    break;

                case 3:
                    stack.lihatSuratTerakhir();
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = sc.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
