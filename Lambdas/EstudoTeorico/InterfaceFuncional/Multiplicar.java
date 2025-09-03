package Lambdas.EstudoTeorico.InterfaceFuncional;

public class Multiplicar implements Calculo {
    
    @Override
    public double executar(double a, double b) {
        return a * b;
    }
}
