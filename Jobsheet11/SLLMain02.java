package Jobsheet11;

//import java.util.Scanner;

public class SLLMain02 {
    public static void main(String[] args) {
        SingleLinkedList02 sll = new SingleLinkedList02();
    
        Mahasiswa02 mhs1 = new Mahasiswa02("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa02 mhs2 = new Mahasiswa02("23212201", "Bimon", "2B", 3.8);
        Mahasiswa02 mhs3 = new Mahasiswa02("22212202", "Cintia", "3C", 3.5);
        Mahasiswa02 mhs4 = new Mahasiswa02("21212203", "Dirga", "4D", 3.6);

    //     Scanner sc = new Scanner(System.in);
    //     int pilihan;
        
    //     do {
    //         System.out.println("\n=== MENU LINKED LIST MAHASISWA ===");
    //         System.out.println("1. Tambah Mahasiswa di Awal");
    //         System.out.println("2. Tambah Mahasiswa di Akhir");
    //         System.out.println("3. Tambah Mahasiswa setelah Nama Tertentu");
    //         System.out.println("4. Tambah Mahasiswa pada Index Tertentu");
    //         System.out.println("5. Tampilkan Data Mahasiswa");
    //         System.out.println("6. Keluar");
    //         System.out.print("\nPilih menu: ");
    //         pilihan = sc.nextInt();
    //         sc.nextLine();

    //         switch (pilihan) {
    //             case 1: {
    //                 Mahasiswa02 mhs = inputMahasiswa(sc);
    //                 sll.addFirst(mhs);
    //             }
    //             break;

    //             case 2: {
    //                 Mahasiswa02 mhs = inputMahasiswa(sc);
    //                 sll.add(mhs);
    //             }
    //             break;

    //             case 3: {
    //                 System.out.print("Tambahkan Mahasiswa setelah nama : ");
    //                 String namaTarget = sc.nextLine();
    //                 System.out.println();
    //                 System.out.println("Tambahkan Mahasiswa");
    //                 Mahasiswa02 mhs = inputMahasiswa(sc);
    //                 sll.insertAfter(namaTarget, mhs);
    //             }
    //             break;

    //             case 4: {
    //                 System.out.print("Masukkan index (mulai dari 0): ");
    //                 int index = sc.nextInt();
    //                 sc.nextLine(); // buang newline
    //                 Mahasiswa02 mhs = inputMahasiswa(sc);
    //                 sll.insertAt(index, mhs);
    //             }
    //             break;

    //             case 5:  sll.print();
    //             break;

    //             case 6:  System.out.println("Keluar dari program.");
    //             break;

    //             default:  System.out.println("Pilihan tidak valid!");
    //             break;
    //         }
    //     } while (pilihan != 6);

    //     sc.close();
    // }

    // public static Mahasiswa02 inputMahasiswa(Scanner sc) {
    //     System.out.print("Masukkan NIM: ");
    //     String nim = sc.nextLine();
    //     System.out.print("Masukkan Nama: ");
    //     String nama = sc.nextLine();
    //     System.out.print("Masukkan Kelas: ");
    //     String kelas = sc.nextLine();
    //     System.out.print("Masukkan IPK: ");
    //     double ipk = sc.nextDouble();
    //     sc.nextLine(); // buang newline
    //     return new Mahasiswa02(nim, nama, kelas, ipk);
        
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.add(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();

        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Rimon berada pada indeks : "+sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.removeAt(0);
        sll.print();
    }
}
