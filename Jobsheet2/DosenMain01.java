package Jobsheet2;
public class DosenMain01 {
    public static void main(String[] args) {
        int tahun = 2025;

        Dosen02 dosen1 = new Dosen02();
        dosen1.idDosen = "D001";
        dosen1.nama = "Erfan Rohadi";
        dosen1.bidangKeahlian = "Aljabar Linier";
        dosen1.tahunBergabung = 2011;

        dosen1.tampilInformasi();
        dosen1.setStatusAktif(false);
        System.out.println("Lama Tahun Kerja " + dosen1.nama + " : " + dosen1.hitungMasaKerja(tahun));
        dosen1.ubahKeahlian("B.Inggris");
        System.out.println();
        dosen1.tampilInformasi();
        System.out.println();

        Dosen02 dosen2 = new Dosen02("D002", "Satrio Binusa", "B.Inggris", 2008);

        dosen2.tampilInformasi();
        dosen2.setStatusAktif(false);
        System.out.println("Lama Tahun Kerja " + dosen2.nama + " : " + dosen2.hitungMasaKerja(tahun));
        dosen2.ubahKeahlian("Aljabar Linier");
        System.out.println();
        dosen2.tampilInformasi();
    }
}