package Jobsheet13.Praktikum1;

public class BinaryTreeRekursifTest02 {
    public static void main(String[] args) {
        BinaryTree02 bst = new BinaryTree02();

        // Penambahan data menggunakan rekursif
        bst.addRekursif(new Mahasiswa02("244160121", "Ali", "A", 3.57));
        bst.addRekursif(new Mahasiswa02("244160221", "Badar", "B", 3.85));
        bst.addRekursif(new Mahasiswa02("244160185", "Candra", "C", 3.21));
        bst.addRekursif(new Mahasiswa02("244160220", "Dewi", "B", 3.54));

        System.out.println("\nDaftar semua mahasiswa (in order traversal):");
        bst.traverseInOrder(bst.root);

        // Pencarian data
        System.out.println("\nPencarian data mahasiswa:");
        System.out.println("Cari Mahasiswa dengan IPK = 3.54 : ");
        String hasilCari = bst.find(3.54) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        System.out.println("Cari Mahasiswa dengan IPK = 3.22 : ");
        hasilCari = bst.find(3.22) ? "Ditemukan" : "Tidak ditemukan";
        System.out.println(hasilCari);

        // Penambahan 3 mahasiswa lagi
        bst.addRekursif(new Mahasiswa02("244160131", "Devi", "A", 3.72));
        bst.addRekursif(new Mahasiswa02("244160205", "Ehsan", "D", 3.37));
        bst.addRekursif(new Mahasiswa02("244160170", "Fizi", "B", 3.46));

        System.out.println("\nDaftar semua mahasiswa setelah penambahan (in order):");
        bst.traverseInOrder(bst.root);
    }
}