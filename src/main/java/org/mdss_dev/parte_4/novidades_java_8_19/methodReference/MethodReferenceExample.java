package org.mdss_dev.parte_4.novidades_java_8_19.methodReference;

public class MethodReferenceExample {

    public static void main(String[] args) {

        Programar programar = Method::programarEmJava;
        programar.programar();
    }
}
