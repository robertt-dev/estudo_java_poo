package Lambdas.Exercicios.ExerciciosChat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function04 {

    public static void main(String[] args) {

        List<String> palavrasRandom = Arrays.asList("Casa", "Macaco", "Balao", "Apartamento");

        Function<String, Integer> getTamanho = tamanho ->  { return tamanho.length(); };
        
        for(int i = 0; i < palavrasRandom.size(); i++) {
            System.out.println(getTamanho.apply(palavrasRandom.get(i)));
        }
    }
}










// Crie uma Function<String, Integer> que recebe uma palavra e retorna o tamanho dela.

// Aplique em uma lista de palavras e imprima os resultados.
