package Heranca.Exercicio02;

import java.util.ArrayList;

public class Zoologico {
    public static void main(String args[]){

        Animal g1 = new Gato("Zed", 8);
        Animal c1 = new Cachorro("Brutus", 5);

        //System.out.println(g1.emitirSom());
        //System.out.println(c1.emitirSom());

        ArrayList<Animal> a1 = new ArrayList<>();
        a1.add(g1);
        a1.add(c1);

        for(Animal animal : a1){
            System.out.println(animal.emitirSom());
        } 
    }
}
