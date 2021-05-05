
package com.gabriel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class compoñentes19 {

    JFrame marco;
    JPanel panel;
    JButton limpar;
    JButton premer;
    JTextField liñaNome;
    JTextField liñaContraseña;
    JLabel nome;
    JLabel contraseña;
    JTextArea textArea;

    public void iniciar(){

        marco=new JFrame("marco con compoñentes");
        panel = new JPanel ();
        limpar = new JButton("Limpar");
        premer = new JButton("Premer");
        nome = new JLabel(" NOME :");
        contraseña = new JLabel(" PASSWORD :");
        liñaNome = new JTextField();
        liñaContraseña = new JTextField();
        textArea = new JTextArea();

        //damoslle as características

        marco.setSize(800, 800);
        panel.setSize(750, 750);
        panel.setLayout(null);// anulamos o layount do panel
        limpar.setSize(100, 50);
        premer.setBounds(0, 50, 100, 50);
        premer.setToolTipText(" copia o que temos na liña na area de texto");
        liñaNome.setBounds(150, 100, 200, 100);
        liñaContraseña.setBounds(150, 200, 200, 100);
        textArea.setBounds(400, 300, 200, 300);
        nome.setBounds(0, 100, 50, 100);
        contraseña.setBounds(0, 200, 100, 100);

        // engadimos compoñentes

        panel.add(nome);
        panel.add(liñaNome);
        panel.add(contraseña);
        panel.add(liñaContraseña);
        panel.add(textArea);
        panel.add(premer);
        panel.add(limpar);

        marco.add(panel);

        marco.setLocationRelativeTo(marco);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setVisible(true);
    }


}
