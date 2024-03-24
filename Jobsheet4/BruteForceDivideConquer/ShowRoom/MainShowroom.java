package ShowRoom;

public class MainShowroom {

<<<<<<< HEAD
    public static int highestAcceleration(Car[] daftarMobil, int low, int high) {
=======
    public static double highestAcceleration(Car[] daftarMobil, int low, int high) {
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd
        if (low == high) {
            return daftarMobil[low].getTopAcceleration();
        }

        int mid = (low + high) / 2;
<<<<<<< HEAD
        int leftMax = highestAcceleration(daftarMobil, low, mid);
        int rightMax = highestAcceleration(daftarMobil, mid + 1, high);
=======
        double leftMax = highestAcceleration(daftarMobil, low, mid);
        double rightMax = highestAcceleration(daftarMobil, mid + 1, high);
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd

        return Math.max(leftMax, rightMax);
    }

<<<<<<< HEAD
    public static int lowestAcceleration(Car[] daftarMobil, int low, int high) {
=======
    public static double lowestAcceleration(Car[] daftarMobil, int low, int high) {
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd
        if (low == high) {
            return daftarMobil[low].getTopAcceleration();
        }

        int mid = (low + high) / 2;
<<<<<<< HEAD
        int leftMin = lowestAcceleration(daftarMobil, low, mid);
        int rightMin = lowestAcceleration(daftarMobil, mid + 1, high);
=======
        double leftMin = lowestAcceleration(daftarMobil, low, mid);
        double rightMin = lowestAcceleration(daftarMobil, mid + 1, high);
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd

        return Math.min(leftMin, rightMin);
    }

    public static void main(String[] args) {
        Car[] daftarMobil = new Car[8];
        daftarMobil[0] = new Car("BMW", "M2 Coupe", "2016", 6816, 728);
        daftarMobil[1] = new Car("Ford", "Fiesta ST", "2014", 3921, 575);
        daftarMobil[2] = new Car("Nissan", "370Z", "2009", 4360, 657);
        daftarMobil[3] = new Car("Subaru", "BRZ", "2014", 4058, 609);
        daftarMobil[4] = new Car("Subaru", "Impreza WRX STI", "2013", 6255, 703);
        daftarMobil[5] = new Car("Toyota", "AE86 Trueno", "1986", 3700, 553);
        daftarMobil[6] = new Car("Toyota", "86/GT86", "2014", 4180, 609);
        daftarMobil[7] = new Car("Volkswagen", "Golf GTI", "2014", 4180, 631);

<<<<<<< HEAD
        int maxAcceleration = highestAcceleration(daftarMobil, 0, daftarMobil.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxAcceleration);

        int minAcceleration = lowestAcceleration(daftarMobil, 0, daftarMobil.length - 1);
=======
        double maxAcceleration = highestAcceleration(daftarMobil, 0, daftarMobil.length - 1);
        System.out.println("Top acceleration tertinggi: " + maxAcceleration);

        double minAcceleration = lowestAcceleration(daftarMobil, 0, daftarMobil.length - 1);
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd
        System.out.println("Top acceleration terendah: " + minAcceleration);

        int totalPower = 0;
        for (Car car : daftarMobil) {
            totalPower += car.getTopPower();
        }
<<<<<<< HEAD
        int averagePower = (int) totalPower / daftarMobil.length;
=======
        double averagePower = (double) totalPower / daftarMobil.length;
>>>>>>> d45114d221d166c9763223b9eb0b12fc8065a4bd
        System.out.println("Rata-rata top power: " + averagePower);
    }
}
