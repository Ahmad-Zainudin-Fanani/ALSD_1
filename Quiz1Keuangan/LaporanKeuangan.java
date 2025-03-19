package Quiz1Keuangan;
public class LaporanKeuangan {

public String namaPerusahaan;
public double pendapatanBulanan;
public double biayaOperasional;

public LaporanKeuangan(String namaPerusahaan, double pendapatanBulanan, double biayaOperasional) {
    this.namaPerusahaan = namaPerusahaan;
    this.pendapatanBulanan = pendapatanBulanan;
    this.biayaOperasional = biayaOperasional;
}

public String getNamaPerusahaan() {

    return namaPerusahaan;
}

public double getPendapatanBulanan() {

    return pendapatanBulanan;
}

public double getBiayaOperasional() {

    return biayaOperasional;
}
    
    public double hitungKeuntungan() {
        return pendapatanBulanan - biayaOperasional;
    }
    public void printData() {
        double keuntungan = hitungKeuntungan();
        System.out.println("Nama Perusahaan: " + namaPerusahaan);
        System.out.println("Pendapatan Bulanan: " + pendapatanBulanan);
        System.out.println("Biaya Operasional: " + biayaOperasional);
        System.out.println("Keuntungan: " + keuntungan);
    }
}
