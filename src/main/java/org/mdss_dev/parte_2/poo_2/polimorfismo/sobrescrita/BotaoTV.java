package org.mdss_dev.parte_2.poo_2.polimorfismo.sobrescrita;

public class BotaoTV extends BotaoFogao{

    @Override
    public void ligar() {
        System.out.println("ligando a tv");
    }

    @Override
    public void desligar() {
        System.out.println("chega de tv por hoje, vai descansar");
    }
}
