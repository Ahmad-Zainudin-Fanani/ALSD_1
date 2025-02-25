public class matakuliah02 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahjam;

    public matakuliah02(){
        
    }

    public matakuliah02(String kodeMK, String nama, int sks, int jumlahjam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahjam = jumlahjam;
    }

    void tampilkanInformasi() {
        System.out.println("Nama       : " + nama);
        System.out.println("Kode MK    : " + kodeMK);
        System.out.println("sks        : " + sks);
        System.out.println("Jumlah jam : " + jumlahjam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("sks telah diubah");
    }

    void tambahJam(int jam) {
        jumlahjam += jam;
    }

    void kurangiJam(int jam) {
        if (jumlahjam - jam >= 0) {
            jumlahjam -= jam;
        } else {
            System.out.println("Jumlah jam tidak cukup untuk dikurangi!");
        }
    }
}
