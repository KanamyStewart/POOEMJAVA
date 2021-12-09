package view;

import java.awt.*;
import javax.swing.*;

public class Cadastrar extends JFrame {

    
    JTextField texto1 = new JTextField("Informe o Nome",20);
    JTextField texto2 = new JTextField(25);

    JTextField texto3 = new JTextField("ESCREVA SEU TEXTO AQUI!!",10);

    public Cadastrar() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(texto1);
        pane.add(texto2);
        pane.add(texto3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,150);
        this.setVisible(true);
    }

    public static void main(String[] args){
        Cadastrar janela = new Cadastrar();
    }
}