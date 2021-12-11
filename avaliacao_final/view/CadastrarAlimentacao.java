package view;

import java.awt.*;
import javax.swing.*;

public class CadastrarAlimentacao extends JFrame {

    JTextField texto1 = new JTextField("Informe Data",20);
    JTextArea textArea1 = new JTextArea("Informe Detalhes da alimentação",10,30);

    public CadastrarAlimentacao() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.LEFT));

        pane.add(texto1);

        pane.add(textArea1);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(480,300);
        this.setVisible(true);
    }
}