package ShowRoom;

public class Car {
    String merk, tipe, tahun;
    int top_acceleration, top_power;
    
    public Car(){}

    public Car(String merk, String tipe, String tahun, int top_acceleration, int top_power){
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
}
