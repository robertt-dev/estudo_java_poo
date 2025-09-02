package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste2 {
    public static void main(String args[]){


        //Interface funcional java.lang
        BinaryOperator<Double> calc = (x, y) -> { return x + y; };

        System.out.println(calc.apply(3.0, 10.0));
    }
}
