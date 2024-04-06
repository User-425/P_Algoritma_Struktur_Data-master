import java.util.Arrays;

public class PencarianBuku01 {
    Buku listBk[] = new Buku[5];
    int idx;

    public void tambah(Buku m) {
        if (idx < listBk.length) {
            listBk[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        for (Buku buku : listBk) {
            buku.tampilDataBuku();
        }
    }

    public int findSeqSearch(String cari) {
        int posisi = -1;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data: " + x + " ditemukan pada indeks ke-" + pos);
        } else {
            System.out.println("Data: " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku\t : " + x);
            System.out.println("Judul\t: " + listBk[pos].judul);
            System.out.println("Tahun Terbit\t: " + listBk[pos].tahunTerbit);
            System.out.println("Pengarang\t: " + listBk[pos].pengarang);
            System.out.println("Stock\t: " + listBk[pos].stock);
        } else {
            System.out.println("data " + x + "tidak ditemukan");
        }
    }

    public Buku FindBuku(String cari) {
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].kodeBuku.equals(cari)) {
                return listBk[i];
            }
        }
        return null;
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equals(listBk[mid].kodeBuku)) {
                return (mid);
            } else if (Integer.parseInt(listBk[mid].kodeBuku) > Integer.parseInt(cari)) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;  
    }

    public void sequentialSearch(String title) {
        boolean found = false;
        for (int i = 0; i < listBk.length; i++) {
            if (listBk[i].judul.equalsIgnoreCase(title)) {
                TampilData(Integer.parseInt(listBk[i].kodeBuku), i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Buku dengan judul '" + title + "' tidak ditemukan.");
        }
    }
     public void binarySearchByTitle(String title) {
        // Sorting
        Arrays.sort(listBk, (a, b) -> a.judul.compareToIgnoreCase(b.judul));

        boolean found = false;
        int left = 0;
        int right = listBk.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = listBk[mid].judul.compareToIgnoreCase(title);
            if (compare == 0) {
                found = true;
                // Cek apakah ada lebih dari satu hasil dengan judul yang sama
                int start = mid;
                while (start > 0 && listBk[start - 1].judul.equalsIgnoreCase(title)) {
                    start--;
                }
                int end = mid;
                while (end < listBk.length - 1 && listBk[end + 1].judul.equalsIgnoreCase(title)) {
                    end++;
                }
                if (start != end) {
                    System.out.println("Ada lebih dari satu buku dengan judul '" + title + "'!");
                }
                for (int i = start; i <= end; i++) {
                    TampilData(Integer.parseInt(listBk[i].kodeBuku), i);
                }
                break;
            } else if (compare < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (!found) {
            System.out.println("Buku dengan judul '" + title + "' tidak ditemukan!");
        }
    }
}
