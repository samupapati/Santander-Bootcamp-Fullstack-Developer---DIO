import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Escreva um número:");
        int numero = input.nextInt();
        int result = 1;

        for(int i = numero; i >= 1; i--){
            System.out.print(i + " x ");
            result *= i;
        }
        System.out.println("");
        System.out.println(result);
    }
}
