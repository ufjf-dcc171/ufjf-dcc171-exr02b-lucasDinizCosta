package aula03exm02;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
    private final JLabel escrito_1;
    private final JTextField caixa_1;
    private JLabel textoInvertido;
    
    public Janela() throws HeadlessException{
        super("Exercicio 1 - B");
        setLayout(new FlowLayout());
        escrito_1 = new JLabel("Digite um texto para ser invertido: ");
        caixa_1 = new JTextField(20);
        textoInvertido = new JLabel();
        add(escrito_1);
        add(caixa_1);
        add(textoInvertido);
        caixa_1.addActionListener(new funcao());
    }
    
    public class funcao implements ActionListener{

        public String inverterTexto(){
            String texto = caixa_1.getText();
            String aux = "";
            for(int i = texto.length()-1; i >= 0 ;i--){
                System.out.println(texto.charAt(i));
                aux = aux+texto.charAt(i);
            }
            System.out.println(aux);
            return aux;
        }
        
        public void actionPerformed(ActionEvent e) {
           textoInvertido.setText("O texto invertido eh: \'"+inverterTexto()+"\'");
        }
    
    }
}
