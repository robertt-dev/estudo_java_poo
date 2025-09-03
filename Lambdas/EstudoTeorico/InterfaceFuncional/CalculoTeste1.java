package Lambdas.EstudoTeorico.InterfaceFuncional;

public class CalculoTeste1 {
    public static void main(String args[]) {

        
        Calculo calculo = (x, y) -> { 
            return x + y; 
        };
        System.out.println(calculo.executar(5, 6));


        Calculo calc = (x, y) -> { 
            return x * y; 
        };
        System.out.println(calc.executar(5, 6));
    }
}
