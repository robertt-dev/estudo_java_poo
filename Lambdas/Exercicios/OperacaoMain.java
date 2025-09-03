package Lambdas.Exercicios;

public class OperacaoMain {
    public static void main(String[] args) {
        
        Operacao soma = (y, x) -> { return y + x; };
        System.out.println(soma.executar(5, 18));

        Operacao subtracao = (y, x) -> { return y - x; };
        System.out.println(subtracao.executar(5, 18));

        Operacao mutiplicacao = (y, x) -> { return y * x; };
        System.out.println(mutiplicacao.executar(5, 18));
    }
}
