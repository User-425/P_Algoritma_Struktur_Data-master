package Tugas;

import java.util.Scanner;

public class PembeliMain {
    static boolean isAutoTampil = false;

    public static void menu(){
        System.out.println("\nMenu: ");
        System.out.println("1. Menambahkan Antrian Pembeli");
        System.out.println("2. Mengeluarkan Antrian Pembeli");
        System.out.println("3. Mengecek Antrian Paling Depan");
        System.out.println("4. Mengecek Antrian Paling Belakang");
        System.out.println("5. Mencari Antrian (Berdasarkan Nama)");
        System.out.println("6. Data Seluruh Pembeli");
        System.out.println("7. Exit");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan kapasitas antrian: ");
        int max = input.nextInt();
        Queue antrian = new Queue(max);
        int pilihan;
        do {
            menu();
            pilihan = input.nextInt();
            input.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan data pembeli ");
                    System.out.print("Nama : ");
                    String nama = input.nextLine();
                    System.out.print("No HP: ");
                    int no_telp = input.nextInt();
                    input.nextLine();
                    antrian.enqueue(new Pembeli(nama, no_telp));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.peek();
                    break;
                case 4:
                    antrian.peekRear();
                    break;
                case 5:
                    System.out.print("Masukkan nama pembeli yang ingin dicari: ");
                    nama = input.nextLine();
                    antrian.peekPosition(nama);
                    break;
                case 6:
                    antrian.daftarPembeli();
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Input Tidak valid!");
            }
        } while (true);

    }

}