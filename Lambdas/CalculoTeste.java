package Lambdas;

public class CalculoTeste {
    public static void main(String args[]) {

        Calculo soma = new Soma();
        Calculo multiplicar = new Multiplicar();
        

        System.out.println(soma.executar(4, 5));
    }
}
