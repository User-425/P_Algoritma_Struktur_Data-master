package ArrayObjects;
public class PersegiPanjang {
    public int panjang;
    public int lebar;

    public PersegiPanjang(){
        
    }
    public PersegiPanjang(int p, int l){
        this(p);
        this.lebar = l;
    }
    public PersegiPanjang(int p){
        this();
        this.panjang = p;
    }
}
