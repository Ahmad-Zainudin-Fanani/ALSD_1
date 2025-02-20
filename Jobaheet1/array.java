import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] course = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
                           "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", 
                           "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int[] credit = {2, 2, 2, 3, 2, 2, 3, 2}; // Bobot SKS
        double[] gradePoint = new double[course.length]; // Menyimpan bobot nilai
        double[] nilaiAngka = new double[course.length]; // Menyimpan nilai angka
        String[] nilaiHuruf = new String[course.length]; // Menyimpan nilai huruf

        System.out.println("Program Menghitung IP Semester\n");

        double sum = 0, totalCredit = 0;

        for (int i = 0; i < course.length; i++) {
            System.out.print("Masukkan nilai angka untuk matkul " + course[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            switch ((int) nilaiAngka[i] / 10) {
                case 10:
                case 9:
                case 8:
                    nilaiHuruf[i] = "A";
                    gradePoint[i] = 4.0;
                    break;
                case 7:
                    if (nilaiAngka[i] >= 73) {
                        nilaiHuruf[i] = "B+";
                        gradePoint[i] = 3.5;
                    } else {
                        nilaiHuruf[i] = "B";
                        gradePoint[i] = 3.0;
                    }
                    break;
                case 6:
                    if (nilaiAngka[i] >= 60) {
                        nilaiHuruf[i] = "C+";
                        gradePoint[i] = 2.5;
                    } else {
                        nilaiHuruf[i] = "C";
                        gradePoint[i] = 2.0;
                    }
                    break;
                case 5:
                    nilaiHuruf[i] = "C";
                    gradePoint[i] = 2.0;
                    break;
                case 4:
                    nilaiHuruf[i] = "D";
                    gradePoint[i] = 1.0;
                    break;
                default:
                    nilaiHuruf[i] = "E";
                    gradePoint[i] = 0.0;
                    break;
            }


            sum += gradePoint[i] * credit[i];
            totalCredit += credit[i];
        }
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");

        System.out.printf("%-40s %-12s %-12s %-12s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < course.length; i++) {
            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", course[i], nilaiAngka[i], nilaiHuruf[i], gradePoint[i]);
        }
        System.out.println("====================");

        double finalGrade = sum / totalCredit;
        System.out.printf("\nIP : %.2f\n", finalGrade);
        System.out.println("====================");
        input.close();
    }
}