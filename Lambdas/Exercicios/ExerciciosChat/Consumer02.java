package Lambdas.Exercicios.ExerciciosChat;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer02 {
    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Rafaela", "pablo", "salatiel", "Marcos");
                                                //{} = não se faz nessesario pois só a uma sentença
        Consumer<String> nomesConsumer = nome -> System.out.println(nome.toUpperCase());
        nomes.forEach(nomesConsumer);


        Consumer<String> nomesConsumer01 = nome ->  {
            if(nome.startsWith("A")) {
                System.out.println(nome);
            }
        };

         nomes.forEach(nomesConsumer01);

    }
}


// Dada uma lista de nomes, use um Consumer<String> para:

// Imprimir todos os nomes em letras maiúsculas.
// Imprimir apenas nomes que começam com a letra "A".



    

