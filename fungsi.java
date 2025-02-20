public class fungsi {

    // Harga per jenis bunga
    static final int HARGA_AGLONEMA = 75000;
    static final int HARGA_KELADI = 50000;
    static final int HARGA_ALOCASIA = 60000;
    static final int HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        // Data stok awal bunga di setiap cabang
        int[][] stokBunga = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        // Rincian pengurangan stok karena kerusakan
        int[] penguranganStok = {-1, -2, -0, -5};

        // Menampilkan pendapatan setiap cabang
        tampilkanPendapatan(stokBunga);

        // Menampilkan jumlah stok tiap jenis bunga di semua cabang
        tampilkanTotalStok(stokBunga);

        // Mengurangi stok bunga hanya untuk RoyalGarden 4
        perbaruiStokRoyalGarden4(stokBunga, penguranganStok);
    }

    // Fungsi untuk menghitung pendapatan setiap cabang
    public static void tampilkanPendapatan(int[][] stok) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * HARGA_AGLONEMA) +
                             (stok[i][1] * HARGA_KELADI) +
                             (stok[i][2] * HARGA_ALOCASIA) +
                             (stok[i][3] * HARGA_MAWAR);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
        System.out.println();
    }

    // Fungsi untuk menghitung total stok tiap jenis bunga
    public static void tampilkanTotalStok(int[][] stok) {
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;

        for (int[] cabang : stok) {
            totalAglonema += cabang[0];
            totalKeladi += cabang[1];
            totalAlocasia += cabang[2];
            totalMawar += cabang[3];
        }

        System.out.println("Total Stok Tiap Jenis Bunga di Semua Cabang:");
        System.out.println("Aglonema : " + totalAglonema);
        System.out.println("Keladi   : " + totalKeladi);
        System.out.println("Alocasia : " + totalAlocasia);
        System.out.println("Mawar    : " + totalMawar);
        System.out.println();
    }

    // Fungsi untuk memperbarui stok hanya untuk RoyalGarden 4
    public static void perbaruiStokRoyalGarden4(int[][] stok, int[] pengurangan) {
        int index = 3; // RoyalGarden 4 ada di indeks ke-3 dalam array

        stok[index][0] += pengurangan[0];
        stok[index][1] += pengurangan[1];
        stok[index][2] += pengurangan[2];
        stok[index][3] += pengurangan[3];

        System.out.println("Stok RoyalGarden 4 Setelah Pengurangan Karena Kerusakan:");
        System.out.println("Aglonema = " + stok[index][0]);
        System.out.println("Keladi   = " + stok[index][1]);
        System.out.println("Alocasia = " + stok[index][2]);
        System.out.println("Mawar    = " + stok[index][3]);
    }
}