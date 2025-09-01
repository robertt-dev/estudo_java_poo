package Heranca.Exercicio02;

public class Gato extends Animal {

    Gato(String nome, int idade){
        super(nome, idade);
    }

    @Override
    String emitirSom() {
        return "MiauMiau";
    }
    
}
