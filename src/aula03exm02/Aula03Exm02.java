package aula03exm02;

import javax.swing.JFrame;

public class Aula03Exm02 {

    public static void main(String[] args) {
        Janela j = new Janela();
        j.setLocationRelativeTo(null);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300,300);
        j.setVisible(true);
    }

}
