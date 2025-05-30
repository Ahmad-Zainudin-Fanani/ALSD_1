package Jobsheet12;

public class DoubleLinkedList02 {
    NodeMahasiswa02 head, tail;

    public DoubleLinkedList02() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void print() {
        NodeMahasiswa02 current = head;
        while (current != null) {
            current.data.tampilInformasi();
            current = current.next;
        }
    }

    public void addFirst(Mahasiswa02 data) {
        NodeMahasiswa02 newNode = new NodeMahasiswa02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa02 data) {
        NodeMahasiswa02 newNode = new NodeMahasiswa02(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String keyNim, Mahasiswa02 data) {
        NodeMahasiswa02 current = head;
        while (current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Node dengan NIM " + keyNim + " tidak ditemukan");
            return;
        }
        NodeMahasiswa02 newNode = new NodeMahasiswa02(data);

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

    // public void insertAt(int index, Mahasiswa02 input) {
    //     if (index < 0) {
    //         System.out.println("index salah");
    //     } else if (index == 0) {
    //         addFirst(input);
    //     } else {
    //         NodeMahasiswa02 temp = head;
    //         for (int i = 0; i < index - 1; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = new NodeMahasiswa02(input, temp.next);
    //         if (temp.next.next == null) {
    //             tail = temp.next;
    //         }
    //     }
    // }

    // public void getData(int index) {
    //     NodeMahasiswa02 tmp = head;
    //     for (int i = 0; i < index; i++) {
    //         tmp = tmp.next;
    //     }
    //     tmp.data.tampilInformasi();
    // }

    // public int indexOf(String key) {
    //     NodeMahasiswa02 tmp = head;
    //     int index = 0;
    //     while (tmp != null && !tmp.data.nama.equalsIgnoreCase(key)) {
    //         tmp = tmp.next;
    //         index++;
    //     }
    //     if (tmp == null) {
    //         return -1;
    //     } else {
    //         return index;
    //     }
    // }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong, tidak dapat dihapus");
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    // public void remove(String key) {
    //     if (isEmpty()) {
    //         System.out.println("Linked List masih kosong, tidak dapat dihapus");
    //     } else {
    //         NodeMahasiswa02 temp = head;
    //         while (temp != null) {
    //             if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
    //                 this.removeFirst();
    //                 break;
    //             } else if (temp.data.nama.equalsIgnoreCase(key)) {
    //                 temp.next = temp.next.next;
    //                 if (temp.next == null) {
    //                     tail = temp;
    //                 }
    //                 break;
    //             }
    //             temp = temp.next;
    //         }
    //     }
    // }

    // public void removeAt(int index) {
    //     if (index == 0) {
    //         removeFirst();
    //     } else {
    //         NodeMahasiswa02 temp = head;
    //         for (int i = 0; i < index; i++) {
    //             temp = temp.next;
    //         }
    //         temp.next = temp.next.next;
    //         if (temp.next == null) {
    //             tail = temp;
    //         }
    //     }
    // }
}