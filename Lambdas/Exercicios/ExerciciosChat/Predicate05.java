package Lambdas.Exercicios.ExerciciosChat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate05 {

    public static void main(String[] args){

        List<Integer> numerosRandom = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> ehPar = numero -> { return numero % 2 == 0; };

        for(int i = 0; i < numerosRandom.size(); i++) {
            if(ehPar.test(numerosRandom.get(i))) {
                System.out.println(numerosRandom.get(i));
            }
        }
    }
}




// Crie um Predicate<Integer> que testa se um número é par.

// Use com uma lista de números de 1 a 10.
// Imprima apenas os números que passam no teste.