package Jobsheet5;
import java.util.Scanner;
public class MainPangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen : ");
        int elemen = input.nextInt();
        input.nextLine();

        pangkat[] png = new pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i + 1) + " : ");
            int basis = input.nextInt();
            input.nextLine();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i + 1) + " : ");
            int pangkat = input.nextInt();
            input.nextLine();
            png[i] = new pangkat(basis, pangkat);
        }

        System.out.println("Hasil Pangkat Brute Force : ");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("Hasil Pangkat Divide And Conquer : ");
        for (pangkat p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }

    }
}