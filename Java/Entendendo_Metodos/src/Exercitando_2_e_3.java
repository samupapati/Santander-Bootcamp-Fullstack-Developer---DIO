public class Exercitando_2_e_3 {
    public static void main(String[] args){
        area(3);
        area(4.5, 5);
        area(5,5);
        area(7,8,9);
    }

    public static double area(double lado) {

        System.out.println("Área do quadrado:" + lado * lado);
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        System.out.println("Área do retângulo:" + lado1 * lado2);
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
        return ((baseMaior + baseMenor) * altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
        return (diagonal1 * diagonal2) / 2;
    }
}
