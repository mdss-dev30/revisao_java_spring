package org.mdss_dev.parte_4.novidades_java_8_19.records;

public class Main {

    public static void main(String[] args) {
        DepoisDoRecord depoisDoRecord = new DepoisDoRecord("Douglas", "rua do java", "12345678");
        System.out.println(depoisDoRecord.endereco());
        System.out.println(depoisDoRecord.telefone().equals("12345678"));
        System.out.println(depoisDoRecord.endereco());
    }
}
