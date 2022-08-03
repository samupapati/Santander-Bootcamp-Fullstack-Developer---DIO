package ExerciciosCorrigidos;

public class Calculadora implements OperacaoMatematica{

    @Override
    public void soma(double n1, double n2) {
        System.out.println("Soma: " + n1 + n2);
    }

    @Override
    public void subtracao(double n1, double n2) {
        System.out.println("Subtração: " + (n1 - n2));
    }

    @Override
    public void multiplicacao(double n1, double n2) {
        System.out.println("Multiplicacao: " + n1 * n2);
    }

    @Override
    public void divisao(double n1, double n2) {
        System.out.println("Divisão: " + n1 / n2);
    }
}
