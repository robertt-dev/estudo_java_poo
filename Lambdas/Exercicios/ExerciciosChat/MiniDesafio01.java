package Lambdas.Exercicios.ExerciciosChat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MiniDesafio01 {

    public static void main(String[] args) {

        List<String> nomesTeste = Arrays.asList("Robert", "Ana", "Matheus", "Bard", "Felipe");

        //Retorna boolen
        Predicate<String> maisLetras = nome -> {return nome.length() > 5; };

        Consumer<String> nomesAprovados = nome -> { 
            if(maisLetras.test(nome) == true){
                System.out.println("Nome Aprovado: " + nome);
            } else {
                System.out.println("Reprovados: " + nome);
            }
         };

        nomesTeste.forEach(nomesAprovados);
    }  
}



// Mini Desafio

// Combine Predicate e Consumer:

// Faça um Predicate<String> que verifica se um nome tem mais de 5 letras.
// Se o nome passar, use um Consumer<String> para imprimir "Nome aprovado: X".
