package org.mdss_dev.parte_2.input_output;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.Scanner;

public class NotaFiscal {

    public static void main(String[] args) throws IOException {

        System.out.println("Por favor, insira o código do produto");
        Scanner scanner = new Scanner(System.in);
        String codigo = scanner.nextLine();
        System.out.println("Por favor, insira a quantidade de itens desse produto");
        Integer quantidade = scanner.nextInt();
        System.out.println("Digite o valor do produto");
        Integer valor = scanner.nextInt();
        int total = valor * quantidade;
        System.out.println("O valor total da sua compra é  " + total);
        System.out.println("Aguarde um momento....\nEstamos emitindo sua nota fiscal");
        Path fileName = Path.of(
                "C:\\projetos\\revisao-java\\nota-fiscal-"+codigo+".txt");
        String text = "Código do produto:  " + codigo +  "\nQtde:  " + quantidade + "\nvalor do produto:  " + valor
                + "\ntotal da compra: " + total + "";
        Files.writeString(fileName, text);
        String file_content = Files.readString(fileName);
        System.out.println(file_content);
    }
}
