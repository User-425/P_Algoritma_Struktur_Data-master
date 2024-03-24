import java.util.Scanner;

public class MainSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===============================================================");
        System.out.println("Masukkan Jumlah Perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        Sum[] perusahaan = new Sum[jumlahPerusahaan];

        System.out.println("===============================================================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        for (int i = 0; i < perusahaan.length; i++) {
            System.out.println("===============================================================");
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc.nextInt();

            perusahaan[i] = new Sum(elm);
            System.out.println("===============================================================");
            for (int j = 0; j < perusahaan[i].elemen; j++) {
                System.out.print("Masukkan untung bulan ke " + (j + 1) + " = ");
                perusahaan[i].keuntungan[j] = sc.nextDouble();
            }
            sc.nextLine();
            System.out.println("===============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
            System.out.println("===============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.printf("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = %.2f \n",
                    perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen - 1));
        }
    }
}
