package Lambdas.Exercicios.ExerciciosChat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MiniDesafio02 {

    public static void main(String[] args){
    
        List<Double> listaPreco = Arrays.asList(10.0, 22.50, 43.60, 60.0, 99.9);

        Predicate<Double> numeroMaior = numero -> { return numero >= 20; };  
        
        Consumer<Double> mostraPreco = preco -> { 
            if(numeroMaior.test(preco) == true) {
                System.out.println("Preço válido: " + preco);
            } else {
                System.out.println("Preço baixo demais: " + preco);
            }
        };

        listaPreco.forEach(mostraPreco);
        
    }
}



// Mini Desafio 2

// Crie um programa que:

// Tenha uma lista de preços (List<Double>) com valores variados. x

// Exemplo: 10.0, 23.5, 99.9, 5.5, 60.0  x

// Crie um Predicate<Double> que testa se o preço é maior que 20.   x

// Crie um Consumer<Double> que imprime assim:  
// "Preço válido: X" se o Predicate for verdadeiro.
// "Preço baixo demais: X" se for falso.

// Percorra a lista com forEach, combinando Predicate e Consumer.

// 👉 Assim como no desafio anterior, você vai precisar usar test() dentro do Consumer e tomar uma decisão (if).
