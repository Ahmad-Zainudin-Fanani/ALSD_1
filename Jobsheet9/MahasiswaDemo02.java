package Jobsheet9;

import java.util.Scanner;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        StackTugasMahasiswa02 stack = new StackTugasMahasiswa02(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat tugas Teratas");
            System.out.println("4. Melihat Daftar tugas");
            System.out.println("5. Melihat tugas Terbawah");
            System.out.println("6. Melihat Jumlah tugas yang sudah dikumpulkan"); // ✅ Tambahan
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // konsumsi newline

            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa02 mhs = new Mahasiswa02(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;

                case 2:
                    Mahasiswa02 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        scan.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;

                case 3:
                    Mahasiswa02 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas:");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                case 5: // ✅ Melihat tugas terbawah
                    Mahasiswa02 terbawah = stack.bottom();
                    if (terbawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + terbawah.nama);
                    }
                    break;

                case 6: // ✅ Melihat jumlah tugas yang sudah dikumpulkan
                    int jumlahTugas = stack.count();
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + jumlahTugas);
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilih >= 1 && pilih <= 6); // ✅ Tambahkan batas menu baru

        scan.close();
    }
}
