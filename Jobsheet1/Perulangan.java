package Jobsheet1;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========================================");
        System.out.println("Tugas Perulangan");
        System.out.println("=========================================");
        System.out.print("Masukan Nim Anda : ");
        String NIM = input.nextLine();
        int n = Integer.parseInt(NIM.substring(NIM.length() - 2));
        if (n < 10) {
            n += 10;
        }
        System.out.println("=========================================");
        System.out.println("N adalah :"+n);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.print(" * ");
            }else if (i==6 || i==10){
                continue;
            }
            else{
                System.out.print(i);
            }
        }
    }

}
