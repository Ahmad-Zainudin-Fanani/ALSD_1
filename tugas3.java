import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan jumlah mata kuliah
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline

        // Deklarasi array untuk menyimpan data mata kuliah
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // Input data mata kuliah
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        // Menu utama
        while (true) {
            System.out.println("\n=== Menu Jadwal Kuliah ===");
            System.out.println("1. Tampilkan Seluruh Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Membersihkan newline

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String cariHari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMatkul, sks, semester, hariKuliah, cariHari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int cariSemester = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(namaMatkul, sks, semester, hariKuliah, cariSemester);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String cariMatkul = scanner.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, cariMatkul);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }

        scanner.close();
    }

    // Menampilkan seluruh jadwal kuliah
    public static void tampilkanSeluruhJadwal(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah) {
        System.out.println("\n=== Seluruh Jadwal Kuliah ===");
        for (int i = 0; i < namaMatkul.length; i++) {
            System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
        }
    }

    // Menampilkan jadwal berdasarkan hari tertentu
    public static void tampilkanJadwalBerdasarkanHari(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String hari) {
        System.out.println("\n=== Jadwal Kuliah pada Hari " + hari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah pada hari " + hari);
        }
    }

    // Menampilkan jadwal berdasarkan semester tertentu
    public static void tampilkanJadwalBerdasarkanSemester(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, int semesterCari) {
        System.out.println("\n=== Jadwal Kuliah Semester " + semesterCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di semester " + semesterCari);
        }
    }

    // Mencari mata kuliah berdasarkan nama
    public static void cariMataKuliah(String[] namaMatkul, int[] sks, int[] semester, String[] hariKuliah, String matkulCari) {
        System.out.println("\n=== Pencarian Mata Kuliah: " + matkulCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < namaMatkul.length; i++) {
            if (namaMatkul[i].equalsIgnoreCase(matkulCari)) {
                System.out.println(namaMatkul[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hariKuliah[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}