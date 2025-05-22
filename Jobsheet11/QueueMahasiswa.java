package Jobsheet11;

public class QueueMahasiswa {
    Node front, rear;
    int size;

    public QueueMahasiswa() {
        this.front = this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(String nama) {
        Node baru = new Node(nama);
        if (rear == null) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Mahasiswa " + nama + " berhasil mendaftar.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa memanggil.");
            return;
        }
        System.out.println("Memanggil mahasiswa: " + front.nama);
        front = front.next;
        if (front == null)
            rear = null;
        size--;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terdepan: " + front.nama);
            System.out.println("Mahasiswa terakhir: " + rear.nama);
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}