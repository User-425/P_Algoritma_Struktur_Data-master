package Mahasiswa;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        Mahasiswa[] dataMahasiswa = new Mahasiswa[jumlahMahasiswa];

        for (int i = 0; i < dataMahasiswa.length; i++) {
            dataMahasiswa[i] = new Mahasiswa();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan nama: ");
            dataMahasiswa[i].nama = scanner.next();

            System.out.print("Masukkan nim: ");
            dataMahasiswa[i].nim = scanner.next();

            System.out.print("Masukkan jenis kelamin (L/P): ");
            dataMahasiswa[i].jenisKelamin = scanner.next().charAt(0);

            System.out.print("Masukkan IPK: ");
            dataMahasiswa[i].ipk = scanner.nextDouble();
            scanner.nextLine();
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("Nama: " + dataMahasiswa[i].nama);
            System.out.println("NIM: " + dataMahasiswa[i].nim);
            System.out.println("Jenis Kelamin: " + dataMahasiswa[i].jenisKelamin);
            System.out.println("IPK: " + dataMahasiswa[i].ipk);
            System.out.println();
        }

        double rataRataIPK = hitungRataRataIPK(dataMahasiswa);
        System.out.println("Rata-rata IPK mahasiswa: " + rataRataIPK);

        Mahasiswa mahasiswaTerbaik = cariMahasiswaTerbaik(dataMahasiswa);
        System.out.println("\nData Mahasiswa dengan IPK Terbesar:");
        System.out.println("Nama: " + mahasiswaTerbaik.nama);
        System.out.println("NIM: " + mahasiswaTerbaik.nim);
        System.out.println("Jenis Kelamin: " + mahasiswaTerbaik.jenisKelamin);
        System.out.println("IPK: " + mahasiswaTerbaik.ipk);
    }

    public static double hitungRataRataIPK(Mahasiswa[] dataMahasiswa) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : dataMahasiswa) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / dataMahasiswa.length;
    }

    public static Mahasiswa cariMahasiswaTerbaik(Mahasiswa[] dataMahasiswa) {
        Mahasiswa mahasiswaTerbesar = dataMahasiswa[0];
        for (int i = 1; i < dataMahasiswa.length; i++) {
            if (dataMahasiswa[i].ipk > mahasiswaTerbesar.ipk) {
                mahasiswaTerbesar = dataMahasiswa[i];
            }
        }
        return mahasiswaTerbesar;
    }
}
