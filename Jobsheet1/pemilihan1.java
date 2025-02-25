import java.util.Scanner;

public class pemilihan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Program Menghitung Nilai Akhir ");
        System.out.println("==================================");

        // Input nilai
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = scanner.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = scanner.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = scanner.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = scanner.nextDouble();

        // Validasi input
        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || 
            (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            System.out.println("==================================");
            System.out.println("==================================");
            System.out.println("       Nilai tidak valid!");
            System.out.println("==================================");
            System.out.println("==================================");

        } else {
            // Menghitung nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

            // Menentukan nilai huruf
            String nilaiHuruf = "";
            if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73 && nilaiAkhir < 80) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65 && nilaiAkhir < 73) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60 && nilaiAkhir < 65) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50 && nilaiAkhir < 60) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39 && nilaiAkhir < 50) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            // Menentukan kelulusan
            boolean lulus = nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || 
                            nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || 
                            nilaiHuruf.equals("C");

            // Menampilkan hasil
            System.out.println("\n==================================");
            System.out.printf(" Nilai Akhir : %.1f \n", nilaiAkhir);
            System.out.println(" Nilai Huruf : " + nilaiHuruf);
            System.out.println("==================================");

            if (lulus) {
                System.out.println("  SELAMAT ANDA LULUS ");
            } else {
                System.out.println("  MAAF, ANDA TIDAK LULUS ");
            }
            System.out.println("==================================");
        }

        scanner.close();
    }
}