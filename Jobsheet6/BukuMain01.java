import java.util.Scanner;

public class BukuMain01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianBuku01 data = new PencarianBuku01();
        int jumBuku = 5;

        System.out.println("====================");
        System.out.println("Masukkan data Buku secara urut dari KodeBuku terkecil");
        // for (int i = 0; i < jumBuku; i++) {
        //     System.out.println("====================");
        //     System.out.println("Buku ke-" + (i + 1));
        //     System.out.println("====================");
        //     System.out.print("Kode Buku      : ");
        //     int kodeBuku = s.nextInt();
        //     System.out.print("Judul Buku     : ");
        //     String judul = s1.nextLine();
        //     System.out.print("Tahun Terbit   : ");
        //     int tahunTerbit = s.nextInt();
        //     System.out.print("Pengarang Buku : ");
        //     String pengarang = s1.nextLine();
        //     System.out.print("Stock Buku     : ");
        //     int stock = s.nextInt();
        //     data.tambah(new Buku(kodeBuku, judul, pengarang, tahunTerbit, stock));
        // }

        data.tambah(new Buku("111", "Algoritma", "Wahyuni", 2019, 5));
        data.tambah(new Buku("123", "Big Data", "Susilo", 2020, 3));
        data.tambah(new Buku("125", "Desain UI", "Supriadi", 2021, 3));
        data.tambah(new Buku("126", "Web Programming", "Pustaka Adi", 2022, 2));
        data.tambah(new Buku("127", "Etika Mahasiswa", "Darmawan Adi", 2023, 2));

        System.out.println("====================");
        System.out.println("Data Kesuluruhan Buku : ");
        data.tampil();

        System.out.println("====================");
        System.out.println("Cari Data Buku : ");
        System.out.println("====================");
        System.out.println("Masukkan Kode Buku yang ingin dicari : ");
        String cari = s.next();
        System.out.println("Mencari menggunakan sequential search...");
        int posisi = data.findSeqSearch(cari);
        data.tampilPosisi(Integer.parseInt(cari), posisi);
        data.TampilData(Integer.parseInt(cari), posisi);
        
        System.out.println("====================");
        System.out.println("Cari Data Buku Menggunakan FindBuku(): ");
        System.out.println("====================");
        Buku dataBuku = data.FindBuku(cari);
        dataBuku.tampilDataBuku();

        System.out.println("====================");
        System.out.println("Cari Data Buku Menggunakan FindBinarySearch(): ");
        System.out.println("====================");
        posisi = data.FindBinarySearch(cari, 0, jumBuku - 1);
        data.tampilPosisi(Integer.parseInt(cari), posisi);
        data.TampilData(Integer.parseInt(cari), posisi);
    }
}
