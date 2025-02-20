public class fungsi {

    // Harga per jenis bunga
    static int HARGA_AGLONEMA = 75000;
    static int HARGA_KELADI = 50000;
    static int HARGA_ALOCASIA = 60000;
    static int HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        // Data stok awal bunga di setiap cabang
        int[][] stokBunga = {
            {10, 5, 15, 7},  // RoyalGarden 1
            {6, 11, 9, 12},  // RoyalGarden 2
            {2, 10, 10, 5},  // RoyalGarden 3
            {5, 7, 12, 9}    // RoyalGarden 4
        };

        // Rincian pengurangan stok karena kerusakan di RoyalGarden 4
        int[] penguranganStok = {-1, -2, -0, -5};

        // Menampilkan pendapatan setiap cabang jika semua bunga terjual
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = (stokBunga[i][0] * HARGA_AGLONEMA) +
                             (stokBunga[i][1] * HARGA_KELADI) +
                             (stokBunga[i][2] * HARGA_ALOCASIA) +
                             (stokBunga[i][3] * HARGA_MAWAR);
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
        System.out.println();

        // Menghitung total stok tiap jenis bunga di semua cabang
        int totalAglonema = 0, totalKeladi = 0, totalAlocasia = 0, totalMawar = 0;
        for (int[] cabang : stokBunga) {
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

        // Mengurangi stok bunga hanya untuk RoyalGarden 4
        int index = 3; // Indeks RoyalGarden 4 dalam array
        stokBunga[index][0] += penguranganStok[0];
        stokBunga[index][1] += penguranganStok[1];
        stokBunga[index][2] += penguranganStok[2];
        stokBunga[index][3] += penguranganStok[3];

        System.out.println("Stok RoyalGarden 4 Setelah Pengurangan Karena Kerusakan:");
        System.out.println("Aglonema = " + stokBunga[index][0]);
        System.out.println("Keladi   = " + stokBunga[index][1]);
        System.out.println("Alocasia = " + stokBunga[index][2]);
        System.out.println("Mawar    = " + stokBunga[index][3]);
    }
}
