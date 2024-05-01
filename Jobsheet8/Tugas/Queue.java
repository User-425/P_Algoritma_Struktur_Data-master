package Tugas;

public class Queue {
    Pembeli[] antrian;
    int front, rear, size, max;

    Queue(int n) {
        max = n;
        antrian = new Pembeli[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void enqueue(Pembeli antri) {
        if (isFull()) {
            System.out.println("Antrian sudah penuh!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        antrian[rear] = antri;
        size++;
        System.out.println("Pembeli berhasil ditambahkan!");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return -1;
        }
        int temp = front;
        front = (front + 1) % max;
        size--;
        System.out.println("Pembeli berhasil dikeluarkan!");
        return temp;
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Data Antrian: ");
        int index = front;
        while (index != rear) {
            System.out.println("Pembeli ke-" + (index + 1));
            System.out.print("Nama: " + antrian[index].nama);
            System.out.print("No HP: " + antrian[index].noHP);
            index = (index + 1) % max;
        }
        System.out.println("Pembeli ke-" + (rear + 1));
        System.out.print("Nama: " + antrian[rear].nama);
        System.out.print("No Hp: " + antrian[rear].noHP);
    }

    public void peek() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Pembeli terdepan adalah: ");
        System.out.print("Nama: " + antrian[front].nama);
        System.out.print("No HP: " + antrian[front].noHP);
    }

    public void peekRear() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        System.out.println("Pembeli paling belakang adalah: ");
        System.out.print("Nama:  " + antrian[rear].nama);
        System.out.print("No HP: " + antrian[rear].noHP);
    }

    public void peekPosition(String nama) {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return;
        }
        int index = front;
        while (index != rear) {
            if (antrian[index].nama.equals(nama)) {
                System.out.print("Posisi antrian ke-" + index + 1);
                return;
            }
            index = (index + 1) % max;
        }
        if (antrian[rear].nama.equals(nama)) {
            System.out.print("Posisi antrian ke-" + rear + 1);
        }
    }
}