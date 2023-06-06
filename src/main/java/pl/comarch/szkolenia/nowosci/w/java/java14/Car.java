package pl.comarch.szkolenia.nowosci.w.java.java14;

public class Car {
    private final String brand;
    private final String model;
    private final int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
