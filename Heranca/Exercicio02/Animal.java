package Heranca.Exercicio02;

public class Animal {
    private String nome;
    private int idade;

    String emitirSom(){
        return "Som genérico de animal";
    }

    Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }


    //Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    
}
