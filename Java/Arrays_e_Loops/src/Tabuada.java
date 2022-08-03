import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero = 0;

        System.out.println("Escreva um número");
        numero = input.nextInt();
        System.out.println("Tabuada do número " + numero + ":");
        for(int i = 0; i <= 10; i++){
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}
