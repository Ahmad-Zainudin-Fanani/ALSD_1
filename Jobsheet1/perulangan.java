import java.util.Scanner;

public class perulangan{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Mengambil dua digit terakhir NIM dan menambah 10
        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n<10) {
            n+=10;
        }
        System.out.println("n: " + n);

        // Menampilkan output sesuai aturan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // Cetak angka genap
            } else {
                System.out.print("* "); // Cetak angka ganjil dengan asterisk
            }
        }

        scanner.close();
    }
}