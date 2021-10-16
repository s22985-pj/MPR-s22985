package pl.pjatk.factory;

public class Car {
    private String marka;
    private String model;
    private int pojemnoscSilnika;
    private int vMax;
    private String kolor;

    public Car(String kolor, int vMax, int pojemnoscSilnika, String model, String marka) {
        this.kolor = kolor;
        this.vMax = vMax;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.model = model;
        this.marka = marka;
    }

    public String getMarka() {
        return marka;
    }
}


