package org.mdss_dev.parte_2.poo_1;

public class Objetos {

    public static void main(String[] args) {
        Estudante mdss_dev = new Estudante();
        mdss_dev.setNome("Michael");
        mdss_dev.setStack("Java e Spring");
        mdss_dev.estudar();
        mdss_dev.dormir();
        System.out.println(mdss_dev.getNome());
        System.out.println(mdss_dev.getStack());
    }
}

