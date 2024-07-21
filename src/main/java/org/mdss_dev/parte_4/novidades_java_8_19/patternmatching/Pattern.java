package org.mdss_dev.parte_4.novidades_java_8_19.patternmatching;


public class Pattern {


    static double transformaEmDouble(Object number) {

        return switch (number) {
            case Integer i -> i.doubleValue();
            case Float f -> f.doubleValue();
            case String s -> Double.parseDouble(s);
            default -> 0d;
        };
    }
}
