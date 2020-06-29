package com.geekbrains.work8;

import java.util.*;
import java.util.stream.Collectors;


public class Words {

    public static void main(String[] args) {
    List<String> foo = Arrays.asList("форель","селедка","окунь","селедка","плотва","плотва","форель","плотва","карась","плотва","окунь");
        Map<String, Long> f = foo
                .stream()
                .collect(Collectors.groupingBy(v -> v, Collectors.counting()));
        String maxOccurence =
                Collections.max(f.entrySet(), Comparator.comparing(Map.Entry::getValue)).getKey();

        System.out.println(" Самое часто встречающееся слово - " + maxOccurence);
    }
}
