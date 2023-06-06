package pl.comarch.szkolenia.nowosci.w.java.java14;

public class RekordMain {
    public static void main(String[] args) {
        ImmutableCar car = new ImmutableCar("BMW", "3", 200);
        System.out.println(car.price());
        System.out.println(car.brand());
        System.out.println(car.model());
        car.drive();
    }
}
