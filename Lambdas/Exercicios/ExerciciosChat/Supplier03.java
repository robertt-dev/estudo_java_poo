package Lambdas.Exercicios.ExerciciosChat;

import java.util.function.Supplier;

public class Supplier03 {

    public static void main(String[] args){

        Supplier<Integer> getNumeroAleatorio = () -> { return (int)(Math.random() * 100 + 1); };

        for(int i = 0; i < 5; i++) {
            System.out.println(getNumeroAleatorio.get());
        }
    }
}




// Implemente um Supplier<Integer> que gera números aleatórios entre 1 e 100.

// Gere 5 números chamando get() dentro de um for.
// Imprima cada número gerado.