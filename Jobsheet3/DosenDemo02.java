import java.util.*;

public class DosenDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyak dosen : ");
        String dummy = sc.nextLine();
        System.out.println("-----------------------");
        int array = Integer.parseInt(dummy);
        Dosen02[] arrayDosen02 = new Dosen02[array];

        for (int i = 0; i < arrayDosen02.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            arrayDosen02[i] = new Dosen02();
            arrayDosen02[i].inputDosen();
        }

        DataDosen02 dataDosen02 = new DataDosen02();

        dataDosen02.dataSemuaDosen(arrayDosen02);

        dataDosen02.jumlahDosenPerJenisKelamin(arrayDosen02);

        dataDosen02.rerataUsiaDosenPerJenisKelamin(arrayDosen02);
        
        int index = dataDosen02.infoDosenPalingTua(arrayDosen02);
        arrayDosen02[index].tampilDosen();

        index = dataDosen02.infoDosenPalingMuda(arrayDosen02);
        arrayDosen02[index].tampilDosen();
    }
}
