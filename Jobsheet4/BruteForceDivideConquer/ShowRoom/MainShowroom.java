package ShowRoom;

public class MainShowroom {

        public static void averagePower(Car[] daftarMobil) {
                int totalPower = 0;
                for (Car car : daftarMobil) {
                        totalPower += car.getTopPower();
                }

                int averagePower = (int) totalPower / daftarMobil.length;
                System.out.println("Rata-rata top power: " + averagePower);
        }

        public static int highestAccelerationIndex(Car[] daftarMobil, int low, int high) {
                if (low == high) {
                        return low;
                }

                int mid = (low + high) / 2;
                int leftMaxIndex = highestAccelerationIndex(daftarMobil, low, mid);
                int rightMaxIndex = highestAccelerationIndex(daftarMobil, mid + 1, high);

                return (daftarMobil[leftMaxIndex].getTopAcceleration() > daftarMobil[rightMaxIndex]
                                .getTopAcceleration()) ? leftMaxIndex : rightMaxIndex;
        }

        public static int lowestAccelerationIndex(Car[] daftarMobil, int low, int high) {
                if (low == high) {
                        return low;
                }

                int mid = (low + high) / 2;
                int leftMinIndex = lowestAccelerationIndex(daftarMobil, low, mid);
                int rightMinIndex = lowestAccelerationIndex(daftarMobil, mid + 1, high);

                return (daftarMobil[leftMinIndex].getTopAcceleration() < daftarMobil[rightMinIndex]
                                .getTopAcceleration()) ? leftMinIndex : rightMinIndex;
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

                int maxAccelerationIndex = highestAccelerationIndex(daftarMobil, 0, daftarMobil.length - 1);
                System.out.println("Car with the highest acceleration:");
                daftarMobil[maxAccelerationIndex].showAllData();

                int minAccelerationIndex = lowestAccelerationIndex(daftarMobil, 0, daftarMobil.length - 1);
                System.out.println("\nCar with the lowest acceleration:");
                daftarMobil[minAccelerationIndex].showAllData();

                System.out.println();
                averagePower(daftarMobil);
        }
}
