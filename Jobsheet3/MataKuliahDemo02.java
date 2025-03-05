import java.util.*;

public class MataKuliahDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak Mata Kuliah yang akan dimasukkan : ");
        String dummy = sc.nextLine();
        int array = Integer.parseInt(dummy);
        MataKuliah02[] arrayOfMataKuliah02 = new MataKuliah02[array];
        for (int i = 0; i < arrayOfMataKuliah02.length; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah02[i] = new MataKuliah02();
            arrayOfMataKuliah02[i].tambahData();
        }

        for (int i = 0; i < arrayOfMataKuliah02.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah02[i].cetakInfo();
        }
    }
}