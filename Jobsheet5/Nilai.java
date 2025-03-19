package Jobsheet5;

public class Nilai {
    public String nama, nim, tahun_masuk;
    public int uts, uas;

    Nilai(String nama, String nim, String tahun_masuk, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.tahun_masuk = tahun_masuk;
        this.uts = uts;
        this.uas = uas;
    }

    int tertinggi(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lTertinggi = tertinggi(arr, l, mid);
        int rTertinggi = tertinggi(arr, mid + 1, r);

        if (lTertinggi > rTertinggi) {
            return lTertinggi;
        } else {
            return rTertinggi;
        }
    }

    int terendah(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }

        int mid = (l + r) / 2;
        int lTerendah = terendah(arr, l, mid);
        int rTerendah = terendah(arr, mid + 1, r);

        if (lTerendah > rTerendah) {
            return rTerendah;
        } else {
            return lTerendah;
        }
    }

    double rata(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return (double) total / arr.length;
    }
}