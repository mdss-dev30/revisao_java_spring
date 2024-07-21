package org.mdss_dev.parte_4.novidades_java_8_19.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        //filter -> para retorna elementos que passam em um filtro indicado
        List<String> linguagens = Arrays.asList("Java", "Kotlin", "Rust", "Go");
        List<String> terminaComA = linguagens.stream().filter(a -> a.endsWith("a")).
                collect(Collectors.toList());
        System.out.println(terminaComA);
    }
}
