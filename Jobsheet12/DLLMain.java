package Jobsheet12;

import java.util.Scanner;

public class DLLMain {
    public static void main(String[] args) {
        DoubleLinkedList02 list = new DoubleLinkedList02();
        Scanner scan = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. cari Mahasiswa bedasarkan NIM");
            System.out.println("0. Exit");
            System.out.print("Pilih menu : ");
            pilihan = scan.nextInt();
            scan.nextLine();

            switch (pilihan) {
                case 1: {
                    Mahasiswa02 mhs = inputMahasiswa(scan);
                }
                case 2: {
                    Mahasiswa02 mhs = inputMahasiswa(scan);
                    list.addLast(mhs);
                }
                case 3: {
                    //list.removeFirst();
                }
                case 4: {
                    //list.removeLast();
                }
                case 5: {
                    list.printList();
                }
                case 6: {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scan.nextLine();
                    Node02 found = list.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                }
                case 0: {
                    System.out.println("Keluar dari program.");
                default : { 
                    System.out.println("Pilihan tidak valid");
                }
            }
    
        } while (pilihan != 0);
        scan.close();
    }
    }
}