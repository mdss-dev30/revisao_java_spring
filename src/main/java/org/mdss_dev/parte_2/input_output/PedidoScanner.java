package org.mdss_dev.parte_2.input_output;

import java.util.Scanner;

public class PedidoScanner {

    public static void main(String[] args) {

        System.out.println("Por favor, insira o código do produto");
        Scanner sc = new Scanner(System.in);
        String codigo = sc.nextLine();
        System.out.println("Por favor, insira a quantidade de itens desse produto");
        Integer quantidade = sc.nextInt();
        System.out.println("Digite o valor do produto");
        Integer valor = sc.nextInt();
        int total = valor * quantidade;
        System.out.println("O valor total da sua compra é  " + total);
    }
}