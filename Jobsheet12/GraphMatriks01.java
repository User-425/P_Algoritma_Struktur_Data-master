public class GraphMatriks01 {
    int vertex;
    int[][] matriks;

    public GraphMatriks01(int vertex) {
        this.vertex = vertex;
        matriks = new int[vertex][vertex];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }
    public void removeEdge(int asal, int tujuan){
        matriks[asal][tujuan] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int calculateInDegree(int index) {
        int inDegree = 0;
        for (int i = 0; i < matriks.length; i++) {
            if (matriks[i][index] > 0) {
                inDegree++;
            }
        }
        return inDegree;
    }

    public int calculateOutDegree(int index) {
        int outDegree = 0;
        for (int val : matriks[index]) {
            if (val > 0) {
                outDegree++;
            }
        }
        return outDegree;
    }

    public int calculateTotalDegree(int index) {
        return calculateInDegree(index) + calculateOutDegree(index);
    }

    public void printDegrees(int index) {
        int inDegree = calculateInDegree(index);
        int outDegree = calculateOutDegree(index);
        int totalDegree = calculateTotalDegree(index);

        System.out.println("InDegree dari Gedung " + (char) ('A' + index) + ": " + inDegree);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + index) + ": " + outDegree);
        System.out.println("Degree dari Gedung " + (char) ('A' + index) + ": " + totalDegree);
    }
}

