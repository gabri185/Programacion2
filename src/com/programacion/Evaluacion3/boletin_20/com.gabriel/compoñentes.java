package com.gabriel;

import static java.awt.Color.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class compoñentes {
    JFrame marco;
    JPanel panel;
    JPanel panel2;
    JButton limpar;
    JButton premer;
    JButton boton;
    JTextField liñaNome;
    JTextField liñaContraseña;
    JLabel nome;
    JLabel contraseña;
    JTextArea textArea;
    String [] elementos = {"ElementoLista1","  ","ElementoLista2","  ","ElementoLista3"};
    Border borde;
    JList area;

    public void iniciar(){

        marco=new JFrame("marco con compoñentes");
        panel = new JPanel ();
        panel2 = new JPanel();
        limpar = new JButton("Limpar");
        premer = new JButton("Premer");
        boton = new JButton("BOTON");
        nome = new JLabel(" NOME :");
        contraseña = new JLabel(" PASSWORD :");
        liñaNome = new JTextField();
        liñaContraseña = new JTextField();
        textArea = new JTextArea();
        borde= BorderFactory.createLineBorder(BLACK);
        area= new JList(elementos);
        String [] elementos = {"ElementoLista1","  ","ElementoLista2","  ","ElementoLista3"};

        //damoslle as características


        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.setLocationRelativeTo(null);
        marco.setSize(900,900);
        panel.setSize(850,400);
        panel.setLayout(null);// anulamos o layount do panel
        panel2.setSize(850,400);
        panel2.setLayout(null);
        limpar.setBounds(320,350,130,40);
        premer.setBounds(150,350,130,40);
        boton.setBounds(300,550,100,50);
        premer.setToolTipText(" copia o que temos na liña na area de texto");
        liñaNome.setBounds(280,30,190,40);
        liñaContraseña.setBounds(280,100,190,40);
        textArea.setBounds(450,480,200,220);
        nome.setBounds(80,10,80,80);
        contraseña.setBounds(80,80,80,80);
        textArea.setBorder(borde);
        area.setBorder(borde);
        area.setBounds(40,450,200,250);
        area= new JList(elementos);

        // engadimos compoñentes

        marco.add(panel);
        marco.add(panel2);
        panel.add(nome);
        panel.add(liñaNome);
        panel.add(contraseña);
        panel.add(liñaContraseña);
        panel.add(premer);
        panel.add(limpar);
        panel2.add(boton);
        panel2.add(textArea);
        panel2.add(area);



    }
}

