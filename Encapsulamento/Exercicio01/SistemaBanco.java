package Encapsulamento.Exercicio01;

public class SistemaBanco {
    public static void main(String args[]) {

        ContaBancaria c1 = new ContaBancaria("5678", "Robertt", 1567.77);

        c1.depositar(680.88);
        System.out.println(c1.getSaldo());

        c1.sacar(879);
        System.out.println(c1.getSaldo());
    }
}
