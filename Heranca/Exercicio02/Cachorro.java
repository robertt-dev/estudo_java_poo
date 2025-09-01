package Heranca.Exercicio02;

public class Cachorro extends Animal {
    
    Cachorro(String nome, int idade){
        super(nome, idade);
    }
    @Override
    String emitirSom() {
        return "AuAu!";
    }
    
}
