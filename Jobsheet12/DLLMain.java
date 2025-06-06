package Jobsheet12;

import java.util.Scanner;

public class DLLMain {
    static Scanner scan = new Scanner(System.in);
    static int size;

    public static Mahasiswa02 inputMahasiswa() {
        System.out.println();
        System.out.print("Nim : ");
        String nim = scan.nextLine();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("Kelas : ");
        String kelas = scan.nextLine();
        System.out.print("IPK : ");
        double ipk = scan.nextDouble();
        scan.nextLine();
        Mahasiswa02 mhs = new Mahasiswa02(nim, nama, kelas, ipk);
        return mhs;

    }

    public static void main(String[] args) {
        DoubleLinkedList02 list = new DoubleLinkedList02();
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Tambah di indeks");
            System.out.println("4. Tambah setelah");
            System.out.println();
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Hapus di indeks");
            System.out.println("8. Hapus setelah");
            System.out.println();
            System.out.println("9. Tampilkan semua data");
            System.out.println("10. Tampilkan data pertama");
            System.out.println("11. Tampilkan data akhir");
            System.out.println("12. Tampilkan data indeks");
            System.out.println();
            System.out.println("13. Jumlah node");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1:
                    list.addFirst(inputMahasiswa());
                    size++;
                    break;
                case 2:
                    list.addLast(inputMahasiswa());
                    size++;
                    break;
                case 3:
                    System.out.print("Masukkan indeks: ");
                    int idxTambah = scan.nextInt();
                    scan.nextLine();
                    list.add(idxTambah, inputMahasiswa());
                    size++;
                    break;
                case 4:
                    System.out.print("Tambah data setelah NIM: ");
                    String key = scan.nextLine();
                    list.insertAfter(key, inputMahasiswa());
                    size++;
                    break;
                case 5:
                    list.removeFirst();
                    size--;
                    break;
                case 6:
                    list.removeLast();
                    size--;
                    break;
                case 7:
                    System.out.print("Masukkan indeks yang ingin dihapus: ");
                    int idxHapus = scan.nextInt();
                    scan.nextLine();
                    list.remove(idxHapus);
                    size--;
                    break;
                case 8:
                    System.out.print("Masukkan NIM yang menjadi acuan: ");
                    String nimKey = scan.nextLine();
                    list.removeAfter(nimKey);
                    size--;
                    break;
                case 9:
                    list.print();
                    break;
                case 10:
                    list.getFirst();
                    break;
                case 11:
                    list.getLast();
                    break;
                case 12:
                    System.out.print("Masukkan indeks data yang ingin ditampilkan: ");
                    int idxData = scan.nextInt();
                    scan.nextLine();
                    list.getData(idxData);
                    break;
                case 13:
                    System.out.println(size);
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

        } while (pilihan != 0);

    }

}