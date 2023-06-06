package pl.comarch.szkolenia.nowosci.w.java.java10;

import java.util.List;
import java.util.stream.Collectors;

public class NiemutowalnyCollector {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);

        List<String> listFromStream = list.stream()
                .map(i -> i + "_STRING")
                .collect(Collectors.toUnmodifiableList());

        listFromStream.add("cos");
    }
}
