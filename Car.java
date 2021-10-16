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

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPojemnoscSilnika() {
        return pojemnoscSilnika;
    }

    public void setPojemnoscSilnika(int pojemnoscSilnika) {
        this.pojemnoscSilnika = pojemnoscSilnika;
    }

    public int getvMax() {
        return vMax;
    }

    public void setvMax(int vMax) {
        this.vMax = vMax;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", pojemnoscSilnika=" + pojemnoscSilnika +
                ", vMax=" + vMax +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}


