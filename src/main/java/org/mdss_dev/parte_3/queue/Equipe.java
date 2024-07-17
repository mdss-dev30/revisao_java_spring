package org.mdss_dev.parte_3.queue;

public class Equipe {
    public Equipe(String nome, int saldoDepontos) {
        this.nome = nome;
        this.saldoDepontos = saldoDepontos;
    }

    public String nome;
    public int saldoDepontos;

    @Override
    public String toString() {
        return "Equipe "+  nome  + " está com a pontuação  "+ saldoDepontos;
    }
}
