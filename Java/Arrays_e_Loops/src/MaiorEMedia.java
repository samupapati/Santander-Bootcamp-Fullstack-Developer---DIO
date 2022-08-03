import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numero = 0;
        int maior = 0;
        int media = 0;

        int count = 0;
        while(count < 5){
            System.out.println("Digite um número: ");
            numero = input.nextInt();
            if(numero > maior){
                maior = numero;
            }
            media += numero;

            count++;
        }
        System.out.println("Maior número: " + maior);
        System.out.println("Média dos números: " + media / 5);
    }
}
