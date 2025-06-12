package Jobsheet13.Praktikum2;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree02 bta = new BinaryTree02();

        Mahasiswa02 mhs1 = new Mahasiswa02("244160121", "Ali", "A", 3.57);
        Mahasiswa02 mhs2 = new Mahasiswa02("244160185", "Candra", "C", 3.41);
        Mahasiswa02 mhs3 = new Mahasiswa02("244160221", "Badar", "B", 3.75);
        Mahasiswa02 mhs4 = new Mahasiswa02("244160220", "Dewi", "B", 3.35);

        Mahasiswa02 mhs5 = new Mahasiswa02("244160131", "Devi", "A", 3.48);
        Mahasiswa02 mhs6 = new Mahasiswa02("244160205", "Ehsan", "D", 3.61);
        Mahasiswa02 mhs7 = new Mahasiswa02("244160170", "Fizi", "B", 3.86);

        Mahasiswa02[] datMahasiswa02s = { mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null };
        int idxLast = 6;
        bta.populateData(datMahasiswa02s, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}