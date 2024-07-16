package org.mdss_dev.parte_2.enums;


public enum DescontoEnum {

    FUNCIONARIO(20), ALUNA(10), EXTERNO(5);
    int valor;

    DescontoEnum(int valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {

        for (DescontoEnum descontoEnum : DescontoEnum.values()) {
            System.out.println("Tipo de desconto: " + descontoEnum + " - Valor desconto: " + descontoEnum.valor+"%");
        }
    }
}




