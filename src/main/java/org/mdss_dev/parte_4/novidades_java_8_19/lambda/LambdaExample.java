package org.mdss_dev.parte_4.novidades_java_8_19.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    public static void main(String[] args) {
        //pequeno bloco de codigo que recebe parametros e retorna um valor
        //sao semelhantes aos metodos
        // mas nao precisam de um nome e pode estar dentro do corpo de um outro metodo

        List<String> linguagens = Arrays.asList("Java", "Kotlin", "Rust", "Go");
        List<String> java = linguagens.stream().filter(s -> s.equals("Java")).
                collect(Collectors.toList());
        System.out.println(java);
    }
}
