import java.util.Random;

public class NumeroAleatorio {
    public static void main(String[] args){
        Random numeroAleatorio = new Random();

        int array[] = new int[20];

        for(int i = array.length - 1; i >= 0; i--){
            array[i] = numeroAleatorio.nextInt(100) + 1;
        }
        System.out.println("Números antecessores:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] - 1 + " ");
        }
        System.out.println("");
        System.out.println("Números gerados:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Números sucessores:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + 1 + " ");
        }
    }
}
