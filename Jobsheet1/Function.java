package Jobsheet1;

import java.util.Scanner;

public class Function {
    static int[][] stock = {
        { 10, 5, 15, 7 },
        { 6, 11, 9, 12 },
        { 2, 10, 10, 5 },
        { 5, 7, 12, 9 } };

        public static void main(String[] args) {
            showStock(0, 0, 0, 0, 0);
            userChoice();

        }
        // Show Stock
        public static void showStock(int cabang, int...minusStock) {
            System.out.println("=========================================");
            System.out.println("Toko Bunga Shadow Garden");
            System.out.println("=========================================");
            String firstLine = "╔═══════════════════════╦══════════╦══════════╦══════════╦══════════╗";
            String middleLine = "╠═══════════════════════╬══════════╬══════════╬══════════╬══════════╣";
            String lastLine = "╚═══════════════════════╩══════════╩══════════╩══════════╩══════════╝";
            String formatTable = "║ %-21s ║  %-7s ║  %-7s ║ %-7s  ║ %-7s  ║%n";
            System.out.println(firstLine);
            System.out
                    .println("║ Cabang Shadow Garden  ║ Aglonema ║  Keladi  ║ Alocasia ║ Mawardah ║");
            System.out.println(middleLine);
            for (int i = 0; i < stock.length; i++) {
                if (i == (cabang-1)) {
                    for (int j = 0; j < minusStock.length; j++) {
                        stock[i][j] -= minusStock[j];
                    }
                }
                System.out.format(formatTable, "Shadow Garden " + (i + 1), stock[i][0], stock[i][1], stock[i][2],
                        stock[i][3]);
                if (i < stock.length - 1) {
                    System.out.println(middleLine);
                }
            }
        
            System.out.println(lastLine);
            return;
        }
        //User chooice
        public static void userChoice() {
            System.out.println("=========================================");
            System.out.println("Pilihan Menu");
            System.out.println("=========================================");
            System.out.println("1. Total Uang Jika terjual semua stock");
            System.out.println("2. Kejadian tak terduga");
            System.out.println("=========================================");
            System.out.print("Masukan Pilihan : ");
            Scanner input = new Scanner(System.in);
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                System.out.print("\033[H\033[2J");
                System.out.print("\033[2J\033[1;1H");
                System.out.flush();
                    TotalUang();
                    break;
                case 2:
                System.out.print("\033[H\033[2J");
                System.out.print("\033[2J\033[1;1H");
                System.out.flush();
                    Takterduga();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

            return;
        }
        //Total Uang(pertanyaaan 1)
        public static void TotalUang() {
            System.out.println("Rincian Harga; Aglonema =75.000 , Keladi = 50.000, Alocasia =60.000, Mawar =10.000. \r\n");
            String firstLine = "╔═══════════════════════╦══════════╦══════════╦══════════╦══════════╦══════════════╗";
            String middleLine = "╠═══════════════════════╬══════════╬══════════╬══════════╬══════════╬══════════════╣";
            String lastLine = "╚═══════════════════════╩══════════╩══════════╩══════════╩══════════╩══════════════╝";
            String formatTable = "║ %-21s ║  %-7s ║  %-7s ║ %-7s  ║ %-7s  ║ %-11s  ║%n";
            System.out.println(firstLine);
            System.out
                    .println("║ Cabang Shadow Garden  ║ Aglonema ║  Keladi  ║ Alocasia ║ Mawardah ║     Total    ║");
            System.out.println(middleLine);
            for (int i = 0; i < stock.length; i++) {
                System.out.format(formatTable, "Shadow Garden " + (i + 1), (stock[i][0]*75000), (stock[i][1]*50000), (stock[i][2]*60000),
                        (stock[i][3]*10000), ((stock[i][0]*75000)+(stock[i][1]*50000)+(stock[i][2]*60000)+(stock[i][3]*10000)));
                if (i < stock.length - 1) {
                    System.out.println(middleLine);
                }
            }
            System.out.println(lastLine);
            return;
        }

        //Kejadian tak terduga(pertanyaaan 2)
        public static void Takterduga() {
            System.out.println("=========================================");
            System.out.println("Terjadi Serangan Musuh di Cabang Shadow Garden 4, yang menyebabkan kerusakan pada stock");
            System.out.println("=========================================");
            System.out.println("Rincian Kerusakan : ");
            System.out.println("Aglonema = -1, Keladi = -2, Alocasia = -0, Mawar =-5");
            System.out.println("=========================================");
            showStock(4,1,2,0,5);
            return;
        }
}
