package BangunRuang;

public class LimasSegiEmpat extends BangunRuang {
    private double panjangSisiAlas;
    private double tinggiLimas;

    public LimasSegiEmpat(double panjangSisiAlas, double tinggiLimas) {
        this.panjangSisiAlas = panjangSisiAlas;
        this.tinggiLimas = tinggiLimas;
    }

    public double hitungLuasPermukaan() {
        return 4 * panjangSisiAlas + (panjangSisiAlas * Math.sqrt(4 * tinggiLimas * tinggiLimas + panjangSisiAlas * panjangSisiAlas));
    }

    public double hitungVolume() {
        return (1.0 / 3.0) * panjangSisiAlas * panjangSisiAlas * tinggiLimas;
    }
}
