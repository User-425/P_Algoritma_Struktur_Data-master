import java.util.Scanner;

public class GraphMain01 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Graph01 gedung = new Graph01(6);
        // try {
        //     gedung.addEdge(0, 1, 50);
        //     gedung.addEdge(0, 2, 100);
        //     gedung.addEdge(1, 3, 70);
        //     gedung.addEdge(2, 3, 40);
        //     gedung.addEdge(3, 4, 60);
        //     gedung.addEdge(4, 5, 80);
        //     gedung.degree(0);
        //     gedung.printGraph();
        //     gedung.removeEdge(1, 3);
        //     gedung.printGraph();
        //   while (true) {
        //     System.out.print("\nMasukkan gedung asal: ");
        //     int asal = input.nextInt();
        //     System.out.print("Masukkan gedung tujuan: ");
        //     int tujuan = input.nextInt();
        //     input.nextLine();
        //     boolean isAdjacent = false;
        //     for (int j = 0; j < gedung.list[asal].size(); j++) {
        //         if (gedung.list[asal].get(j) == tujuan) {
        //             isAdjacent = true;
        //             break;
        //         }
        //     }
        //     for (int j = 0; j < gedung.list[tujuan].size(); j++) {
        //         if (gedung.list[tujuan].get(j) == asal) {
        //             isAdjacent = true;
        //             break;
        //         }
        //     }
        //     String hasil = "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + (isAdjacent ? "" : " tidak") + " bertetangga";
        //     System.out.println(hasil);
        // }
        // } catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        GraphMatriks01 gdg = new GraphMatriks01 (4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge (1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge (2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge (3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge: ");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
        System.out.println("Masukkan index yang ingin dicari degreenya: ");
        int degreeSearch  = input.nextInt();
        gdg.printDegrees(degreeSearch);
    }
    
}