package Jobsheet11;

import java.util.Scanner;

public class LayananKemahasiswaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        QueueMahasiswa queue = new QueueMahasiswa();
        int pilihan;

        do {
            System.out.println("\nMenu Layanan Kemahasiswaan:");
            System.out.println("1. Tambah Antrian Mahasiswa");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Tampilkan Antrian Terdepan & Terakhir");
            System.out.println("4. Tampilkan Jumlah Mahasiswa");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();
            input.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = input.nextLine();
                    queue.enqueue(nama);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.tampilkanAntrian();
                    break;
                case 4:
                    queue.jumlahAntrian();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 6);

        input.close();
    }
}
