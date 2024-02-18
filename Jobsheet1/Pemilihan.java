package Jobsheet1;

import java.util.Scanner;

public class Pemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kuis, uts, uas, tugas;
        double NilaiAkhir;
        String grade;
        System.out.println("========================================="
                + "=====================");
        System.out.println("Program Menghitung Nilai Akhir Mahasiswa");
        System.out.println("========================================="
                + "=====================");
        System.out.print("Masukan Nilai Tugas : ");
        tugas = input.nextInt();
        System.out.print("Masukan Nilai Kuis : ");
        kuis = input.nextInt();
        System.out.print("Masukan Nilai UTS : ");
        uts = input.nextInt();
        System.out.print("Masukan Nilai UAS : ");
        uas = input.nextInt();
        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("========================================="
                    + "=====================");
            System.out.println("Nilai yang dimasukan tidak valid");
            System.out.println("========================================="
                    + "=====================");
        } else {
            NilaiAkhir = (0.20 * tugas) + (0.20 * kuis) + (0.30 * uts) + (0.30 * uas);
            if (NilaiAkhir > 80 && NilaiAkhir <= 100) {
                grade = "A";
            } else if (NilaiAkhir > 73 && NilaiAkhir <= 80) {
                grade = "B+";
            } else if (NilaiAkhir > 65 && NilaiAkhir <= 73) {
                grade = "B";
            } else if (NilaiAkhir > 60 && NilaiAkhir <= 65) {
                grade = "C+";
            } else if (NilaiAkhir > 50 && NilaiAkhir <= 60) {
                grade = "C";
            } else if (NilaiAkhir > 39 && NilaiAkhir <= 50) {
                grade = "D";
            } else {
                grade = "E";
            }
            System.out.println("Nilai Akhir : " + NilaiAkhir);
            System.out.println("========================================="
                    + "=====================");
            System.out.println("Grade : " + grade);
            System.out.println("========================================="
                    + "=====================");
                    if (grade.equals("A") || grade.equals("B+") || grade.equals("B")|| grade.equals("C+")|| grade.equals("C")) {
                        System.out.println("Selamat Anda Lulus");
                    } else {
                        System.out.println("Maaf Anda Tidak Lulus");
                    }
        }


    }

}
