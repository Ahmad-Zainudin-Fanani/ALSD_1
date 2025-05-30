package Jobsheet12;

public class Mahasiswa02 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa02() {
    }
    
    public Mahasiswa02(String nm, String name, String kls, double ip) {
        this.nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    

    void tampilInformasi() {
        System.out.println(nama + "\t" + nim + "\t" + kelas + "\t" + ipk);
    }
}