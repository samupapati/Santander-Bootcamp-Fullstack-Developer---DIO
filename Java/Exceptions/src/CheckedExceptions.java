import javax.swing.*;
import java.io.*;

public class CheckedExceptions {
    public static void main(String[] args){
        String nomeDoArquivo = "arquivo.txt";
        try {
            imprimirArquivoNoConsole(nomeDoArquivo);
        }catch (FileNotFoundException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Revise o nome do arquivo que você deseja imprimir!" +
                    e.getCause());
        }catch (IOException e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro inesperado! Entre em contato com o suporte!" +
                    e.getCause());
            e.printStackTrace();
        } finally {
            System.out.println("Chegou o finally");
        }

        System.out.println("Apesar da exception ou não, o programa continua...");
    }

    public static void imprimirArquivoNoConsole(String nomeDoArquivo) throws IOException {
        File file = new File(nomeDoArquivo);

        BufferedReader br = new BufferedReader(new FileReader(file.getName()));
        String line = br.readLine();

        BufferedReader bw = new BufferedReader(new OutputStreamWriter(System.out));

        do{
            bw.write(line);
            bw.newLine();
            line = br.readLine();
        }while(line != null);
        bw.flush();
        br.close();
    }
}
