package org.mdss_dev.parte_2.poo_1.abstracao.classeabstrata;

public class MdBankMain {

    public static void main(String[] args) {

        System.out.println("Seja bem vindo ao Md bank");
        ContaCorrente ccMD = new ContaCorrente();
        ccMD.consultarSaldo();
        ccMD.fazerPix();


        ContaPoupanca cpMD = new ContaPoupanca();
        cpMD.consultarSaldo();
        cpMD.fazerPix();

    }
}
