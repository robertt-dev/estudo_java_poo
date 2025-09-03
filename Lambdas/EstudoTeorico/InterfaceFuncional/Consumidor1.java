package Lambdas.EstudoTeorico.InterfaceFuncional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Consumidor1 {
    public static void main(String[] args) {

        Predicate<String> comecaComA = nome ->  nome.startsWith("A"); };

        List<String> nomes = Arrays.asList("Ana", "Bia", "Amanda", "Pedro");

        

    }
