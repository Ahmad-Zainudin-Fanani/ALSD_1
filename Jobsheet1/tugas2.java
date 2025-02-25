import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            tampilkanMenu();
            System.out.print("Pilih menu (1-3) atau 0 untuk keluar: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 0) {
                System.out.println("Terima kasih!");
                break;
            }

            System.out.print("Masukkan panjang sisi kubus: ");
            double sisi = scanner.nextDouble();

            switch (pilihan) {
                case 1:
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Fungsi menampilkan menu
    public static void tampilkanMenu() {
        System.out.println("=== Menu Perhitungan Kubus ===");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.println("0. Keluar");
    }

    // Fungsi menghitung volume kubus (V = sisi^3)
    public static double hitungVolume(double sisi) {
        return Math.pow(sisi, 3);
    }

    // Fungsi menghitung luas permukaan kubus (L = 6 * sisi^2)
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * Math.pow(sisi, 2);
    }

    // Fungsi menghitung keliling kubus (K = 12 * sisi)
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}