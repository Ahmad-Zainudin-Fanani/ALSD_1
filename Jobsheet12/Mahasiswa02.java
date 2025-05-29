package Jobsheet12;

public class Mahasiswa02 {
    public String nim;
    public String nama;
    public String Kelas;
    public String ipk;

    public Mahasiswa02(String nim, String nama, String Kelas, String ipk) {
        this.nim = nim;
        this.nama = nama;
        this.Kelas = Kelas;
        this.ipk = ipk;
    }

    public void tampil() {
        System.out.println("NIM : " + nim + ", Nama: " + nama + ", Kelas: " + Kelas + ", IPK: " + ipk);
    }
}