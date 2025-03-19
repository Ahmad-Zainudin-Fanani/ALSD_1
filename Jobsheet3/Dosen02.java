package Jobsheet3;
import java.util.*;

public class Dosen02 {
    public String kode, nama;
    public Boolean jenisKelamin;
    public int usia;
    static Scanner sc = new Scanner(System.in);

    public Dosen02(String kode, String nama, Boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public Dosen02() {
    }

    void inputDosen() {
        System.out.print("Kode  : ");
        kode = sc.nextLine();
        System.out.print("Nama  : ");
        nama = sc.nextLine();
        System.out.print("Jenis Kelamin : ");
        String dummy = sc.nextLine();
        if (dummy.equalsIgnoreCase("pria")) {
            jenisKelamin = false;
        } else if (dummy.equalsIgnoreCase("wanita")) {
            jenisKelamin = true;
        }
        System.out.print("Usia  : ");
        dummy = sc.nextLine();
        usia = Integer.parseInt(dummy);
        System.out.println("----------------------");
    }

    void tampilDosen() {
        System.out.println("Kode            : " + kode);
        System.out.println("Nama            : " + nama);
        if (jenisKelamin) {
            System.out.println("Jenis Kelamin   : Wanita");
        } else {
            System.out.println("Jenis Kelamin   : Pria");
        }
        System.out.println("Usia            : " + usia);
        System.out.println("------------------------");
    }

}