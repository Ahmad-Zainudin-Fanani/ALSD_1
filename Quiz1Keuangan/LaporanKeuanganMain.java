package Quiz1Keuangan;
public class LaporanKeuanganMain {
    public static void main(String[] args) {
        LaporanKeuangan[] laporanKeuangan = {
            new LaporanKeuangan("Perusahaan A", 150000, 50000),
            new LaporanKeuangan("Perusahaan B", 200000, 80000),
            new LaporanKeuangan("Perusahaan C", 300000, 100000),
            new LaporanKeuangan("Perusahaan D", 400000, 120000),
            new LaporanKeuangan("Perusahaan E", 500000, 150000)
        };

        double totalKeuntungan = 0;
        double totalKeuntunganDiAtas100000 = 0;
        int countDiAtas100000 = 0;

        for (LaporanKeuangan laporan : laporanKeuangan) {
            laporan.printData(); 
            System.out.println(); 

            double keuntungan = laporan.hitungKeuntungan();
            totalKeuntungan += keuntungan;

            if (laporan.getPendapatanBulanan() > 100000) {
                totalKeuntunganDiAtas100000 += keuntungan;
                countDiAtas100000++;
            }
        }

        double rataRataKeuntungan = countDiAtas100000 > 0 ? totalKeuntunganDiAtas100000 / countDiAtas100000 : 0;
        double persentaseKeuntungan = totalKeuntungan > 0 ? (totalKeuntunganDiAtas100000 / totalKeuntungan) * 100 : 0;

        System.out.println("=== Ringkasan Laporan Keuangan ===");
        System.out.println("Total Keuntungan: " + totalKeuntungan);
        System.out.println("Rata-rata Keuntungan (Pendapatan > 100000): " + rataRataKeuntungan);
        System.out.println("Persentase Keuntungan (Pendapatan > 100000): " + persentaseKeuntungan + "%");
    }
}
