package org.mdss_dev.parte_4.casting.updowncasting;

import java.util.ArrayList;
import java.util.List;

import static org.mdss_dev.parte_4.casting.updowncasting.AlimentarAnimais.alimentar;
import static org.mdss_dev.parte_4.casting.updowncasting.AlimentarAnimais.alimentar;

public class updowncastingMain {

    public static void main(String[] args) {
//         Passaro passaro = new Passaro();
//         // animal = (Animal) passaro;
//         Animal animal = passaro;
//
//         passaro.comer();
//         animal.comer();

//        implicitamente convertemos para Animal (upcasting)
        List<Animal> animalList = new ArrayList<>();
//        animalList.add(new Passaro());
        animalList.add(new Cachorro());

        for(Animal animal: animalList){
            alimentar(animal);
        }

        //downcasting
        Animal animal = new Cachorro();
        animal.comer();
    }
}
