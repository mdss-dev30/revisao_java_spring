package org.mdss_dev.parte_4.novidades_java_8_19.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedAndForEach {
    public static void main(String[] args) {

        List<String> unsortedList = Arrays.asList("7", "5", "3","1", "Java", "Kotlin", "Rust", "Go");

        //sorted -> ordena os itens do stream
        List<String> sortedList = unsortedList.stream().sorted().collect(Collectors.toList());

         //for-each -> itera sobre todos os elementos do stream
        sortedList.forEach(System.out::println);
    }
}
