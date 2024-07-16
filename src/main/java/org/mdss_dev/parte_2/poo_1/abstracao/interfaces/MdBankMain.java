package org.mdss_dev.parte_2.poo_1.abstracao.interfaces;

public class MdBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vinde ao linux tips bank");
        ContaCorrente ccKamila = new ContaCorrente();
        ccKamila.consultarSaldo();
        ccKamila.fazerPix();


        ContaPoupanca cpKamila = new ContaPoupanca();
        cpKamila.consultarSaldo();
        cpKamila.fazerPix();

    }
}
