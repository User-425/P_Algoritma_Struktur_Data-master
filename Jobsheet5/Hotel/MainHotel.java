package Hotel;

public class MainHotel {
    public static void main(String[] args) {
        HotelService hotelService = new HotelService();
        hotelService.tambah(new Hotel("Hotel Bahagia", "Gresik", 1500000, (byte)3));
        hotelService.tambah(new Hotel("Hote Life Grand", "Jakarta", 4000000, (byte)4));
        hotelService.tambah(new Hotel("Hotel Green Life", "Sidoarjo", 3500000, (byte)5));
        hotelService.tambah(new Hotel("Borobudur Hotel", "Surabaya", 3500000, (byte)4));
        
        System.out.println("=================================================================");
        System.out.println("Data sebelum sorting = ");
        System.out.println("=================================================================");
        hotelService.tampilAll();
        System.out.println("=================================================================");
        System.out.println("Data setelah sorting harga termurah menggunakan bubble sort = ");
        System.out.println("=================================================================");
        hotelService.bubbleSort();
        hotelService.tampilAll();
        System.out.println("=================================================================");
        System.out.println("Data setelah sorting bintang tertinggi menggunakan selection sort = ");
        System.out.println("=================================================================");
        hotelService.selectionSort();
        hotelService.tampilAll();
    }
}
