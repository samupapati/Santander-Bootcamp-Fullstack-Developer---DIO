package banco_digital;

import javax.swing.*;


public class Main {
    public static void main(String[] args) {
        Cliente samuel = new Cliente();
        samuel.setNome("Samuel");

        ContaCorrente cc = new ContaCorrente(samuel);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(samuel);

        cc.transferir(100, cp);

        cc.imprimirExtrato();
        System.out.println("");
        cp.imprimirExtrato();

        /*

        JFrame frame = new JFrame("Bank");
        final JLabel label = new JLabel("Seja bem vindo ao bank!");
        frame.getContentPane().add(label);
        final JButton button = new JButton("criar conta");
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

         */
    }
}
