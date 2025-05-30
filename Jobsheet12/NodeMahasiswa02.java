package Jobsheet12;

public class NodeMahasiswa02 {
    Mahasiswa02 data;
    NodeMahasiswa02 next;
    NodeMahasiswa02 prev;

    public NodeMahasiswa02(Mahasiswa02 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}