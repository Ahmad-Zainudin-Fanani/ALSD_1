package Jobsheet10;

import java.util.Scanner;

public class MainLayananKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS();

        int pilihan;
        do {
            System.out.println("\nMenu Layanan KRS");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Mahasiswa dalam Antrian");
            System.out.println("4. Lihat 2 Mahasiswa Terdepan");
            System.out.println("5. Lihat Mahasiswa Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Mahasiswa Belum Proses KRS");
            System.out.println("8. Mahasiswa Sudah Proses KRS");
            System.out.println("9. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa02 mhs = new Mahasiswa02(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    Mahasiswa02[] diproses = antrian.layaniMahasiswa();
                    if (diproses != null) {
                        System.out.println("Mahasiswa yang diproses KRS:");
                        for (Mahasiswa02 m : diproses) {
                            m.tampilkanData();
                        }
                    }
                    break;

                case 3:
                    antrian.tampilkanSemua();
                    break;

                case 4:
                    antrian.lihatDuaTerdepan();
                    break;

                case 5:
                    antrian.lihatTerakhir();
                    break;

                case 6:
                    antrian.getJumlahAntrian();
                    break;

                case 7:
                    antrian.getMhsBelumProses();
                    break;

                case 8:
                    antrian.getMhsSudahProses();
                    break;

                case 9:
                    System.out.println("Terima kasih, keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while(pilihan != 9);

        sc.close();
    }
}
