package pl.comarch.szkolenia.nowosci.w.java.java13;

public class BlokiTekstowe {
    public static void main(String[] args) {
        String s = "{\n" +
                "\t\"name\"=\"cos\"\n" +
                "}";
        String s2 = """
                        dsfgdsfg
                    sdfgsdfg
                        sdfgsdfg
                sdfgsdffdsdf
                sdfsdfg
                szdfs
                gsd
                fgsdfg
                fdsg
                """;

        s2.lines().forEach(l -> System.out.println("Linia: " + l));

        System.out.println(s2);
    }
}
