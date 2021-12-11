package view;

import java.awt.Container;
import java.awt.*;
import javax.swing.*;

public class UpdateGolfinho extends JFrame {
        
    JTextField texto1 = new JTextField("Informe o nome",20);
    JTextField texto2 = new JTextField("Informe a jaula",20);
    JButton fechar;

    public UpdateGolfinho() {

        fechar = new JButton("Atualizar cadastro");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(texto1);
        pane.add(texto2);
        pane.add(fechar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,150);
        this.setVisible(true);
    }
}