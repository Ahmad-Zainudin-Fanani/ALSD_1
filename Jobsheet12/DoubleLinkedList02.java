package Jobsheet12;

public class DoubleLinkedList02 {
    Node02 head;
    Node02 tail;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    public boolean isEmpety() {
        return head == null;
    }

    public void addFirst(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpety()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        Node02 newNode = new Node02(data);
        if (isEmpety()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        Node02 current = head;

        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan.");
            return;
        }

        Node02 newNode = new Node02(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }

        System.out.println("Node berhasil disisipkan setelah NIM " + keyNim);
    }
    
    public void print() {
        Node02 current = head;
        while (current != null) {
            current.data.            
        }
    }
}