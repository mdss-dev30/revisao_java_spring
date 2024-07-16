package org.mdss_dev.parte_2.poo_2.heranca;

public class Pessoa {

    public static void main(String[] args) {
        PessoaDesenvolderaBackend pessoaDesenvolderaBackend =
                new PessoaDesenvolderaBackend("Michael", "java e spring", 9000.0);
        pessoaDesenvolderaBackend.codar();

        PessoaDesenvolvedoraFrontEnd pessoaDesenvolvedoraFrontEnd =
                new PessoaDesenvolvedoraFrontEnd("MichaelMD", "Angular", 8000.0);
        pessoaDesenvolvedoraFrontEnd.codar();


    }
}
