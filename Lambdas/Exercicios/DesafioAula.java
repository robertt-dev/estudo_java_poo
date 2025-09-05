package Lambdas.Exercicios;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioAula {

  public static void main(String[] args) {
    
    Function<Produto, Double> precoFinal = 
    produto -> produto.preco * (1 - produto.desconto);

    UnaryOperator<Double> impostoMunicipal = 
    preco -> preco >= 2500 ? preco * 1.085 : preco;

    UnaryOperator<Double> frete = preco -> 
    preco >= 3000 ? preco + 100 : preco + 50;

    UnaryOperator<Double> arredondar = 
    preco -> Double.parseDouble(String.format(java.util.Locale.US, "%.2f", preco));

    Function<Double, String> formatar = 
    preco -> ("R$" + preco).replace(".", ",");

    Produto p1 = new Produto("iPad", 3235.89, 0.13);

    String preco = precoFinal
    .andThen(impostoMunicipal)
    .andThen(frete)
    .andThen(arredondar)
    .andThen(formatar)
    .apply(p1);

    System.out.println("O preço final é: " + preco);
  }
}




//  1. A partir do produto calcular o preco real (com desconto) xx
//  2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Insento) xx
//  3. Frete: >= 3000 (100)/ < 3000 (50)
//  4. Arredondar: Deixar duas casas decimais
//  5. Formatar: R$1234,56
