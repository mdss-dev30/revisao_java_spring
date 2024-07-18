package org.mdss_dev.parte_4.casting;


public class AutoAndUnboxing {

    public static void main(String[] args) {

        // autoboxing conversao de um valor primitivo em um objeto da classe wrapper correspondente
        int valorInt = 10;
        Integer integer = valorInt;
        System.out.println(integer);

        //unboxing converte do wrapper para o primitivo
        Integer wrapperInteger = 13;
        int primitivoInteger = wrapperInteger;
        System.out.println(primitivoInteger);
    }
}
