package pl.comarch.szkolenia.nowosci.w.java.java11;

import java.util.stream.Stream;

public class MetodyDlaKlasyString {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(s.isBlank());

        String string = "A\nB\nC\nD";
        //System.out.println(string);
        string.lines().forEach(System.out::println);

        String s2 = "5";
        String repeat = s2.repeat(10);
        System.out.println(repeat);

        String s3 = " ABC ";
        System.out.println(s3.strip());
        System.out.println(s3.stripLeading());
        System.out.println(s3.stripTrailing());
    }
}
