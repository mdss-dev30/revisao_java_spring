package org.mdss_dev.parte_4.equalsHashcode;


public class toStringMain {
    public static void main(String[] args) {

        Funcionaria funcionaria = new Funcionaria();
        funcionaria.setCargo("Developer Java");
        funcionaria.setIdade(30);
        funcionaria.setNome("Michael");
        funcionaria.setSetor("Tech");
        funcionaria.setSalario(5100.00);

        System.out.println(funcionaria);

        System.out.println(funcionaria.getNome().equals("Michael"));

        System.out.println(funcionaria.hashCode());
        System.out.println(funcionaria.getSetor().hashCode());
        System.out.println(funcionaria.getSalario().hashCode());
        System.out.println(funcionaria.getNome().hashCode());
        System.out.println(funcionaria.getCargo().hashCode());
        System.out.println(funcionaria.getIdade().hashCode());

        var setorHashCode = String.valueOf(funcionaria.getSetor().hashCode());
        var setorHashCodeNovo = String.valueOf("Tech".hashCode());
        System.out.println(setorHashCode.equals(setorHashCodeNovo));

    }
}