package model;

public class CalculatorBMI2 {

    private float tinggi;
    private float berat;
    private float hasil;

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public void setBerat(float berat) {
        this.berat = berat;
    }

    public void hitung() {
        float tinggiMeter = tinggi / 100f;
        if (tinggiMeter > 0) {
            this.hasil = berat / (tinggiMeter * tinggiMeter);
        } else {
            this.hasil = 0;
        }
    }

    public float getHasil() {
        return hasil;
    }

    public String getKategori() {
        if (hasil < 18.5f) {
            return "Kurus";
        } else if (hasil >= 18.5f && hasil <= 24.9f) {
            return "Ideal (Normal)";
        } else if (hasil >= 25.0f && hasil <= 29.9f) {
            return "Gemuk (Overweight)";
        } else {
            return "Obesitas";
        }
    }
}
