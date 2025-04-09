package Jobsheet7;

public class Dosen02 {
    public String kode;
    public String nama;
    public Boolean jenisKelamin;
    public int umur;

    public Dosen02(String kode, String nama, Boolean jenisKelamin, int umur) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public void tampil() {
        System.out.println("----------------------------");
        System.out.println("Kode Dosen   : " + kode);
        System.out.println("Nama Dosen   : " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Umur         : " + umur);
    }
}