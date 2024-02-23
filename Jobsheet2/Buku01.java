public class Buku01 {
    String judul, pengarang;
    int halaman, stok, harga, totalTerjual;
    
    public Buku01(){

    }

    public Buku01(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul Buku : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp" + harga);
    }

    void terjual(int jml){
        if (stok > 0){ 
         stok -= jml;
         System.out.println("Harga yang perlu dibayar adalah: Rp"+ hitungHargaBayar(jml));
        }else {
            System.out.println("Stok habis!");
        }
    }

    void restock(int jml){
        stok += jml;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
    int hitungHargaTotal(int jml){
        return harga * jml;
    }

    int hitungDiskon(int jml){
        int diskon;
        if (hitungHargaTotal(jml) > 150000) {
            diskon = 12;
        }else if(hitungHargaTotal(jml) <= 150000 || hitungHargaTotal(jml) > 75000){
            diskon = 5;
        }else{
            diskon = 0;
        }
        return diskon;
    }

    int hitungHargaBayar(int jml){
        return (hitungHargaTotal(jml) - (hitungHargaTotal(jml)*hitungDiskon(jml)/100));
    }
}