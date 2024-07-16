package org.mdss_dev.parte_2.input_output;

import java.io.File;
import java.util.Scanner;

public class ValidadorNotaFiscal {
    public static void main(String[] args) throws Exception
    {
        File file = new File("C:\\projetos\\revisao-java\\nota-fiscal-25.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
