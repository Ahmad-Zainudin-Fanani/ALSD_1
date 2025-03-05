import java.util.*;

public class MahasiswaDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dummy;

        Mahasiswa02[] arrayOfMahasiswa02 = new Mahasiswa02[3];
        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa02[i] = new Mahasiswa02();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            arrayOfMahasiswa02[i].nim = sc.nextLine();
            System.out.print("Nama : ");
            arrayOfMahasiswa02[i].nama = sc.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa02[i].kelas = sc.nextLine();
            System.out.print("IPK : ");
            dummy = sc.nextLine();
            arrayOfMahasiswa02[i].ipk = Float.parseFloat(dummy);
            System.out.println("---------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOfMahasiswa02[i].cetakInfo();
        }
    }
}