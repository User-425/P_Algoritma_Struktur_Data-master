package BangunRuang;
import java.util.Scanner;

public class MainBangunRuang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah bangun ruang:");
        int jumlahBangunRuang = scanner.nextInt();

        BangunRuang[] bangunRuang = new BangunRuang[jumlahBangunRuang];

        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("Bangun Ruang ke-" + (i + 1));
            System.out.println("Pilih jenis bangun ruang (1 = Kerucut, 2 = Limas Segi Empat Sama Sisi, 3 = Bola):");
            int jenisBangunRuang = scanner.nextInt();

            switch (jenisBangunRuang) {
                case 1:
                    System.out.println("Masukkan jari-jari kerucut:");
                    double jariJariKerucut = scanner.nextDouble();
                    System.out.println("Masukkan sisi miring kerucut:");
                    double sisiMiringKerucut = scanner.nextDouble();
                    bangunRuang[i] = new Kerucut(jariJariKerucut, sisiMiringKerucut);
                    break;
                case 2:
                    System.out.println("Masukkan panjang sisi alas limas:");
                    double panjangSisiAlas = scanner.nextDouble();
                    System.out.println("Masukkan tinggi limas:");
                    double tinggiLimas = scanner.nextDouble();
                    bangunRuang[i] = new LimasSegiEmpat(panjangSisiAlas, tinggiLimas);
                    break;
                case 3:
                    System.out.println("Masukkan jari-jari bola:");
                    double jariJariBola = scanner.nextDouble();
                    bangunRuang[i] = new Bola(jariJariBola);
                    break;
                default:
                    System.out.println("Masukkan Angka Jenis bangun ruang yang valid!");
            }
        }

        
        for (int i = 0; i < jumlahBangunRuang; i++) {
            System.out.println("\nBangun Ruang ke-" + (i + 1));
            System.out.println("Luas Permukaan: " + bangunRuang[i].hitungLuas());
            System.out.println("Volume: " + bangunRuang[i].hitungVolume());
        }

        scanner.close();
    }
}
