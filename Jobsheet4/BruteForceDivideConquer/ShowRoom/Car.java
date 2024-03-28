package ShowRoom;

public class Car {
    String merk, tipe, tahun;
    int top_acceleration, top_power;

    public Car() {
    }

    public Car(String merk, String tipe, String tahun, int top_acceleration, int top_power) {
        this.merk = merk;
        this.tipe = tipe;
        this.tahun = tahun;
        this.top_acceleration = top_acceleration;
        this.top_power = top_power;
    }

    public int getTopAcceleration() {
        return top_acceleration;
    }

    public int getTopPower() {
        return top_power;
    }

    public void showAllData() {
        System.out.println("Merk: " + merk);
        System.out.println("Tipe: " + tipe);
        System.out.println("Tahun: " + tahun);
        System.out.println("Top Acceleration: " + top_acceleration);
        System.out.println("Top Power: " + top_power);
    }
}
