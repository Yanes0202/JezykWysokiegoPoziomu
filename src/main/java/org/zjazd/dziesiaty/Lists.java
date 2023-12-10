package org.zjazd.dziesiaty;

import java.util.List;

public class Lists {

    public static void main(String[] args) {
        List<String> list = List.of("F", "F", "A", "B", "B", "D", "N", "K");

        System.out.println(list);

        List<String> result = list.stream().filter(s -> s.equals("B")).map(s -> s + "1").toList();

        System.out.println(result);
    }
}
