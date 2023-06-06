package pl.comarch.szkolenia.nowosci.w.java.java8;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringBox = Optional.empty();

        /*if(stringBox.isPresent()) {
            String s = stringBox.get();
            System.out.println("cos robie ze stringiem !!");
        } else {
            System.out.println("o kurde nie ma stringa !!");
        }*/
        Supplier<String> defaultStringSupplier = () -> "Default";

        System.out.println(stringBox.orElseGet(defaultStringSupplier));
        System.out.println(stringBox.orElseGet(defaultStringSupplier));
        System.out.println(stringBox.orElseGet(defaultStringSupplier));

        stringBox.ifPresent(s -> System.out.println(s.toLowerCase()));

        stringBox.ifPresentOrElse(
                s -> System.out.println(s.toLowerCase()),
                () -> System.out.println("o kurde nie ma stringa !!")
        );

        Optional<String> zastepczy = stringBox.or(() -> Optional.of("ABC"));

        stringBox.orElseThrow(() -> new MojCustomowyWyjatek());
    }
}
