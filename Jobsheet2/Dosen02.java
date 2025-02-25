public class Dosen02 {
    String idDosen, bidangKeahlian, nama;
    int tahunBergabung;
    boolean statusAktif;

    public Dosen02() {

    }

    public Dosen02(String idDosen, String nama, String bidangKeahlian, int tahunBergabung) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.bidangKeahlian = bidangKeahlian;
        this.tahunBergabung = tahunBergabung;
        statusAktif = true;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        if (statusAktif == true) {
            System.out.println("Status : Aktif");
        } else if (statusAktif == false) {
            System.out.println("Status : Tidak Aktif");

        }

    }

    void setStatusAktif(boolean status) {
        if (status == true) {
            statusAktif = true;
        } else  {
            statusAktif = false;
        }
    }

    int hitungMasaKerja(int thnSkrg) {
        return thnSkrg -= tahunBergabung;

    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }

}