package Jobsheet11;

public class BinaryTreeArrayMain01 {
    public static void main(String[] args) {
        BinaryTreeArray01 bta = new BinaryTreeArray01();
        int[] data = { 6,4,8,3,5,7,9,0,0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        System.out.print("InOrder Traversal: ");
        bta.traverseInOrder(0);
    }
}
