import java.util.Scanner;

public class ParEImpar {
    public  static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int pares = 0;
        int impares = 0;

        int count = 0;
        while (count < 10){
            System.out.println("Escreva um número:");
            numero = input.nextInt();
            if(numero % 2 == 0){
                pares++;
            } else{
                impares++;
            }

            count++;
        }
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números impares: " + impares);
    }
}
