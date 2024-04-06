/**
 * Buku
 */
public class Buku {

    int kodeBuku, tahunTerbit, stock;
    String judul, pengarang;

    public Buku(int kodeBuku, String judul, String pengarang, int tahunTerbit, int stock) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stock = stock;
    }

    // public void tampil(){

    // }

    public void tampilDataBuku(){
        System.out.println("====================");
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul Buku : " + judul);
        System.out.println("Tahun Terbit : " + tahunTerbit);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Stock : " + stock);
    }
}