package Jobsheet7;

/**
 * StackKonversi01
 */
public class StackKonversi01 {

    int size;
    int top;
    int[] tumpukanBiner;

    public StackKonversi01(){
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(top == size - 1){
            return true;
        }
        return false;
    }

    public void push (int kode){
        if(isFull()){
            System.out.println("Stack Penuh");  
        }
        else{
            top++;
            tumpukanBiner[top] = kode;
            // System.out.println("Data " + kode + " masuk ke stack");
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Kosong");
            return -1;
        }
        else{
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}