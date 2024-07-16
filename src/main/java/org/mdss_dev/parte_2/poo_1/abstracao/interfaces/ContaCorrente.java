package org.mdss_dev.parte_2.poo_1.abstracao.interfaces;

class ContaCorrente implements Conta {

    @Override
    public void consultarSaldo() {
        System.out.println("seu saldo é 1234");
    }

    @Override
    public void fazerPix() {
        System.out.println("digite o valor que voce deseja transferido");
    }
}
