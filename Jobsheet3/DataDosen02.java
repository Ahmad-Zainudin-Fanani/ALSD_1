public class DataDosen02 {

    void dataSemuaDosen(Dosen02[] arrayDosen02) {
        int a = 1;
        for (Dosen02 dosen02 : arrayDosen02) {
            System.out.println("Data Dosen ke-" + a);
            dosen02.tampilDosen();
            a++;
        }
    }

    void jumlahDosenPerJenisKelamin(Dosen02[] arrayDosen02) {
        int l = 0;
        int p = 0;
        for (Dosen02 dosen02 : arrayDosen02) {
            if (dosen02.jenisKelamin) {
                p++;
            } else {
                l++;
            }
        }
        System.out.println("Jumlah Dosen Pria : " + l);
        System.out.println("--------------------------");
        System.out.println("Jumlah Dosen Wanita : " + p);
        System.out.println("---------------------------");
    }

    void rerataUsiaDosenPerJenisKelamin(Dosen02[] arrayDosen02) {
        int l = 0;
        int usiaL = 0;
        int p = 0;
        int usiaP = 0;
        int a = 0;
        for (Dosen02 dosen02 : arrayDosen02) {
            if (dosen02.jenisKelamin) {
                p++;
                usiaP += dosen02.usia;
            } else {
                l++;
                usiaL += dosen02.usia;
            }
            a++;
        }
        System.out.println("Rata rata usia dosen pria : " + usiaL / l);
        System.out.println("------------------------");
        System.out.println("Rata rata usia dosen wanita : " + usiaP / p);
        System.out.println("--------------------------");
    }

    int infoDosenPalingTua(Dosen02[] arrayDosen02) {
        int tertua = 0;
        int index = 0;
        for (int i = 0; i < arrayDosen02.length; i++) {
            if (arrayDosen02[i].usia > tertua) {
                tertua = arrayDosen02[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Tua : " + tertua + " tahun");
        System.out.println("-------------------------");
        return index;
    }

    int infoDosenPalingMuda(Dosen02[] arrayDosen02) {
        int termuda = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arrayDosen02.length; i++) {
            if (arrayDosen02[i].usia < termuda) {
                termuda = arrayDosen02[i].usia;
                index = i;
            }
        }
        System.out.println("Dosen Paling Muda : " + termuda + " tahun");
        System.out.println("---------------------------");
        return index;
    }
}
