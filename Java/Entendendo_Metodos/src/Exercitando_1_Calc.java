public class Exercitando_1_Calc {
    public static void main(String[] args){
        System.out.println("soma: " + somar(1, 5.1));
        System.out.println("subtração: " + subtrair(1, 5));
        System.out.println("divisão: " + dividir(1, 5));
        System.out.println("multiplicação: " + multiplicar(1, 5));

    }

    public static double somar(double n1, double n2){
        return n1 + n2;
    };

    public static double subtrair(double n1, double n2){
        return n1 - n2;
    };

    public static double dividir(double n1, double n2){
        return n1 / n2;
    };

    public static double multiplicar(double n1, double n2){
        return n1 * n2;
    };
}

