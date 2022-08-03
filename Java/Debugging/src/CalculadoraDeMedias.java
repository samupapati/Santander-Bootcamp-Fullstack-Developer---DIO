import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma é %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno : alunos){
            System.out.printf("Nota do aluno %f", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}