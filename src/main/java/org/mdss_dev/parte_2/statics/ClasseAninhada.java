package org.mdss_dev.parte_2.statics;

public class ClasseAninhada {

private ClasseAninhada(){

}
private static class ClasseRealmenteAninhada{
    public static final ClasseAninhada classeAninhada = new ClasseAninhada();
}

public static ClasseAninhada getInstance(){
    return ClasseRealmenteAninhada.classeAninhada;
}
}
