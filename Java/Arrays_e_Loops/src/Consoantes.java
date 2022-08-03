import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[] consoantes = new String[6];
        String[] vogais = {"A", "E", "I", "O", "U"};

        for(int i = consoantes.length - 1; i >= 0; i--){
            System.out.println("Escreva:");
            String palavra = input.nextLine().toUpperCase().trim();
            for(int z = vogais.length - 1; z >= 0; z--){
                palavra = palavra.replace(vogais[z], "");
            };
            consoantes[i] = palavra;
        }
        int contador = 0;
        for(int i = consoantes.length - 1; i >= 0; i--){
            contador += consoantes[i].length();
        }
        System.out.println("Número de consoantes: " + contador);
    }
}
