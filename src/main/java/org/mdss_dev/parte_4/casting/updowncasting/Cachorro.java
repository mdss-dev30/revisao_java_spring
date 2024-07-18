package org.mdss_dev.parte_4.casting.updowncasting;

public class Cachorro  extends Animal{

    @Override
    public void comer() {
        super.comer();
    }

    //downcasting
    public void latir(){
        System.out.println("latir");
    }
}
