package pl.comarch.szkolenia.nowosci.w.java.java9;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MetodyFabrykujaceDoKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7);

        List<Integer> list2 = new ArrayList<>(list);
        list2.add(10);
        System.out.println(list2);

        Set<String> set = Set.of("asd", "asds", "sdfasdf", "sdfasd");

        Map<Integer, String> mapa = Map.of(
                1, "v1",
                2, "v2",
                3, "v3");

        Map<Integer, String> mapa2 = Map.ofEntries(
                Map.entry(1, "v1"),
                Map.entry(2, "v2"),
                Map.entry(3, "v3"),
                Map.entry(4, "v4"),
                Map.entry(5, "v5"),
                Map.entry(6, "v6")
        );
    }
}
