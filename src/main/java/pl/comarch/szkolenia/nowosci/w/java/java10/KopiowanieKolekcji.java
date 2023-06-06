package pl.comarch.szkolenia.nowosci.w.java.java10;

import java.util.ArrayList;
import java.util.List;

public class KopiowanieKolekcji {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<Integer> list2 = new ArrayList<>(list);
        List<Integer> copyList = List.copyOf(list2);
        System.out.println(copyList);
        copyList.add(4);
    }
}
