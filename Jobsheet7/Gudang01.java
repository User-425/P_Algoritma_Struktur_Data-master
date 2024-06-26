package Jobsheet7;

public class Gudang01 {
    Barang01[] tumpukan;
    int top, size;

    Gudang01(int size) {
        tumpukan = new Barang01[size];
        top = -1;
        this.size = size;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void tambahBarang(Barang01 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang "+brg.nama+ " berhasil ditambahkan ke gudang!");
        } else {
            System.out.println("Gagal! Tumpukan barang di Gudang sudah penuh");
        }
    }

    public Barang01 ambilBarang() {
        if (!cekKosong()) {
            Barang01 delete = tumpukan[top];
            top--;
            System.out.println("Barang "+delete.nama+" berhasil diambil dari gudang!");
            System.out.println("Kode Unik dalam biner: "+konversiDesimalkeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
            return null;
        }
    }

    public Barang01 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang01 barangTeratas = tumpukan[top];
            System.out.println("Barang teratas: "+barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
            return null;
        }   
    }

    public void lihatBarangTerbawah(){
        if (!cekKosong()) {
            System.out.println("Barang terbawah: "+tumpukan[0].nama);
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
        }
    }

    public void cariBarang(int kode){
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].kode == kode) {
                    System.out.println("Barang yang dicari: "+tumpukan[i].nama);
                }
            }
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
        }
    }

    public void cariBarang(String nama){
        if (!cekKosong()) {
            for (int i = 0; i <= top; i++) {
                if (tumpukan[i].nama.equals(nama)) {
                    System.out.println("Barang yang dicari: "+tumpukan[i].nama);
                }
            }
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
        }
    }

    public void tampilkanBarang(){
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan barang di Gudang: ");
            for (int i = 0; i <= top; i++) {
                System.out.printf("Kode %d: %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama, tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan barang di Gudang masih kosong");
        }
    }

    public String konversiDesimalkeBiner(int kode){

        StackKonversi01 stack = new StackKonversi01();
        while (kode>0) {
            int sisa = kode%2;
            stack.push(sisa);
            kode = kode/2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }

}
