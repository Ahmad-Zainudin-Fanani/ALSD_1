package Jobsheet5;

public class MainNilai {
    public static void main(String[] args) {
        Nilai[] daftarNilai = {
            new Nilai("Ahmad", "220101001", "2022", 78, 82),
            new Nilai("Budi", "220101002", "2022", 85, 88),
            new Nilai("Cindy", "220101003", "2021", 90, 87),
            new Nilai("Dian", "220101004", "2021", 76, 79),
            new Nilai("Eko", "220101005", "2023", 92, 95),
            new Nilai("Fajar", "220101006", "2020", 88, 85),
            new Nilai("Gina", "220101007", "2023", 80, 83),
            new Nilai("Hadi", "220101008", "2020", 82, 84)
        };

        int[] nilaiUTS = ekstrakNilai(daftarNilai, true);
        int[] nilaiUAS = ekstrakNilai(daftarNilai, false);

        System.out.println("Nilai Tertinggi UTS : " + daftarNilai[0].tertinggi(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai Terendah UTS : " + daftarNilai[0].terendah(nilaiUTS, 0, nilaiUTS.length - 1));
        System.out.println("Nilai Rata-rata UAS : " + daftarNilai[0].rata(nilaiUAS));
    }

    private static int[] ekstrakNilai(Nilai[] daftarNilai, boolean uts) {
        int[] nilai = new int[daftarNilai.length];
        for (int i = 0; i < daftarNilai.length; i++) {
            nilai[i] = uts ? daftarNilai[i].uts : daftarNilai[i].uas;
        }
        return nilai;
    }
}