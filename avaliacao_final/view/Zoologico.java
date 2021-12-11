package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zoologico extends JFrame {

    JButton button1 = new JButton("Listar Leões");
    JButton button2 = new JButton("Adicionar novo Leão");
    JButton button3 = new JButton("Alterar Leão");
    JButton button4 = new JButton("Deletar Leão");

    JButton button5 = new JButton("Listar Golfinhos");
    JButton button6 = new JButton("Adicionar novo Golfinho");
    JButton button7 = new JButton("Alterar Golfinho");
    JButton button8 = new JButton("Deletar Golfinho");


    public Zoologico() {

        Container pane = this.getContentPane();
        pane.setLayout(new FlowLayout(FlowLayout.CENTER));

        pane.add(button1);
        pane.add(button2);
        pane.add(button3);
        pane.add(button4);

        pane.add(button5);
        pane.add(button6);
        pane.add(button7);
        pane.add(button8);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setVisible(true);

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                button1ActionPerformed(e);
            }
        });
    }
    private void button1ActionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog(
            this, 
            "ISSO É UM TESTE",
            "FUNCIONA!",
            JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args){
        Zoologico zoologico = new Zoologico();
    }
}