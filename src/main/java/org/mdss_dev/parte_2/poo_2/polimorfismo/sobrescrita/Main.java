package org.mdss_dev.parte_2.poo_2.polimorfismo.sobrescrita;

public class Main {

    public static void main(String[] args) {
        BotaoFogao botaoFogao = new BotaoFogao();
        botaoFogao.ligar();
        botaoFogao.desligar();

        BotaoTV botaoTV = new BotaoTV();
        botaoTV.ligar();
        botaoTV.desligar();
    }

}