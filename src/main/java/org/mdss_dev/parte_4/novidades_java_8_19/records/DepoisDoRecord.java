package org.mdss_dev.parte_4.novidades_java_8_19.records;


// oficialmente no Java 16
//um record é uma classe que armazena dados, ela é imutavel
//ja possui por padrão so metodos equals, hashCode e toString
//diminui escrita de codigo boiler plate e do lombok

public record DepoisDoRecord(String nome, String endereco, String telefone) {
}
