package Encapsulamento.Exercicio01;

public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;

    ContaBancaria(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }
    
    void depositar(double valor){
        this.saldo += valor;
    }

    double sacar(double valor){

        if(this.saldo > valor){ 
            this.saldo -= valor; 
        } return saldo;
    }
    
    
    
    
    //Getters and Settres
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
}
