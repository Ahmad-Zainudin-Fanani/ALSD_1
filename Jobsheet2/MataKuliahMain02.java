public class MataKuliahMain02 {

    public static void main(String[] args) {
        Matakuliah02 matkul1 = new Matakuliah02();
        matkul1.kodeMK = "1H";
        matkul1.nama = "Dasar pemrograman";
        matkul1.sks = 4;
        matkul1.jumlahjam = 3;

        matkul1.tampilkanInformasi();
        matkul1.ubahSKS(6);
        matkul1.tambahJam(2);
        matkul1.kurangiJam(3);
        matkul1.tampilkanInformasi();
        
        Matakuliah02 matkul2 = new Matakuliah02("1G", "Algoritma dan struktur data" , 4, 3);

        matkul2.tampilkanInformasi();
        matkul2.ubahSKS(6);
        matkul2.tambahJam(2);
        matkul2.kurangiJam(3);
        matkul2.tampilkanInformasi();

    }
}