package Lambdas.Exercicios;

import java.util.Arrays;
import java.util.List;

public class LambdaList {
    public static void main(String[] args) {
        
        List<String> nomes = Arrays.asList("Maria", "João", "Paulo", "Clara", "Roberta");

        nomes.forEach(nome -> { 
            if(nome.length() > 5) { 
                System.out.println(nome); 
        } 
            
    });
}}
