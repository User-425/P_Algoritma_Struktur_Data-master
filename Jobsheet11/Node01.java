package Jobsheet11;

/**
 * Node01
 */
public class Node01 {

    int data;
    Node01 left, right;

    public Node01() {}
    
    public Node01(int item) {
        this.data = item;
        this.left = this.right = null;
    }
}