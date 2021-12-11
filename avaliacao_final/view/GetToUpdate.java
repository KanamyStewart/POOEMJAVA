package view;

import java.awt.Container;

import java.awt.*;
import javax.swing.*;

public class GetToUpdate extends JFrame {
        
    JTextField texto1 = new JTextField("Informe o ID",20);
    JButton fechar;

    public GetToUpdate() {

        fechar = new JButton("Pesquisar");
        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(texto1);
        pane.add(fechar);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,150);
        this.setVisible(true);
    }
}
