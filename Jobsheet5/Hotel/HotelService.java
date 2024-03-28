package Hotel;

public class HotelService {
    Hotel rooms[] = new Hotel[0];

    public void tambah(Hotel H) {
        Hotel[] temp = new Hotel[rooms.length + 1];
        for (int i = 0; i < rooms.length; i++) {
            temp[i] = rooms[i];
        }
        temp[rooms.length] = H;
        rooms = temp;
    }

    public void tampilAll() {
        for (Hotel hotel : rooms) {
            System.out.println("Hotel: " + hotel.nama + " | Kota: " + hotel.kota + " | Harga: " + hotel.harga + " | Bintang: "
                    + hotel.bintang);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].harga > rooms[j - 1].harga) {
                    Hotel tmp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = tmp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < rooms.length-1; i++) {
            int idx = i;
            for (int j = i+1; j < rooms.length; j++) {
                if (rooms[j].bintang < rooms[idx].bintang) {
                    idx = j;
                }
            }
            Hotel temp = rooms[idx];
            rooms[idx] = rooms[i];
            rooms[i] = temp;
        }
    }
}
