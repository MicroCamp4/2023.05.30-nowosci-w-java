package pl.comarch.szkolenia.nowosci.w.java.java14;

public record ImmutableCar(String brand, String model, int price) {
    public void drive() {
        System.out.println("jade !!!");
        System.out.println(this.model);
    }
}
