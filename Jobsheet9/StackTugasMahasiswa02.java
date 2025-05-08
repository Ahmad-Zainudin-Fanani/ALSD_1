package Jobsheet9;

public class StackTugasMahasiswa02 {
    private Mahasiswa02[] stack;
    private int top;

    public StackTugasMahasiswa02(int kapasitas) {
        stack = new Mahasiswa02[kapasitas];
        top = -1;
    }

    public void push(Mahasiswa02 mhs) {
        if (top < stack.length - 1) {
            stack[++top] = mhs;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas.");
        }
    }

    public Mahasiswa02 pop() {
        if (top >= 0) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public Mahasiswa02 peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    //Menghitung berapa banyak tugas yang sudah dikumpulkan
    public int count() {
        return top + 1; // karena top dimulai dari -1, jadi jumlah tugas adalah top + 1
    }

    //Melihat tugas terbawah
    public Mahasiswa02 bottom() {
        if (top >= 0) {
            return stack[0]; // data pertama kali masuk berada di indeks 0
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    public String konversiDesimalKeBiner(int nilai) {
        StackKonversi stack = new StackKonversi();
        while (nilai != 0) {
            int sisa = nilai %2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpety()) {
            biner += stack.pop();
        }
        return biner;
    }

    public void print() {
        if (top >= 0) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Tidak ada tugas yang dikumpulkan.");
        }
    }
}
