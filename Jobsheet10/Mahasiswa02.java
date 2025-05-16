package Jobsheet10;

public class Mahasiswa02 {
    String nim, nama, Prodi, kelas;

    public Mahasiswa02(String nim, String nama, String Prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.Prodi = Prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(nim + " - " + nama + " - " + Prodi + " - " + kelas);
    }
}
