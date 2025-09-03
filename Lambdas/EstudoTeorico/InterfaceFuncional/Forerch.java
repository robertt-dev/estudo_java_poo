package Lambdas.EstudoTeorico.InterfaceFuncional;

import java.util.List;
import java.util.Arrays;

public class Forerch {
    
    public static void main(String[] args) {
        
        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
        
        //Maneira tradicional percorrer array
        for(String nome : aprovados){
            System.out.println(nome);
        }

        //com Lambdas
        aprovados.forEach((nome) -> System.out.println(nome));

    }
}
