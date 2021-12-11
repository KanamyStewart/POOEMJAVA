package view;

import java.awt.*;
import javax.swing.*;

public class CadastrarLeao extends JFrame {

    JTextField texto1 = new JTextField("Informe o Nome do Leão",20);
    JButton button3 = new JButton("Informar Jaula");
    JButton button1 = new JButton("Alimentar");
    JButton button2 = new JButton("Adicionar Visitante");

    public CadastrarLeao() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(texto1);

        pane.add(button3);
        pane.add(button1);
        pane.add(button2);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(360,150);
        this.setVisible(true);
    }

}