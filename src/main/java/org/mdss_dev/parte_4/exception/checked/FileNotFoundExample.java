package org.mdss_dev.parte_4.exception.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExample {

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("invalidpath.txt");
        } catch (FileNotFoundException e) {
            System.out.println("arquivo não localizado no caminho informado, ocorreu o seguinte erro: "+ e);
        }
    }
}
