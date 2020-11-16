package com.programacion.boletin_07.boletin7_4;

import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {

        clases obx = new clases();
        String nome1 = JOptionPane.showInputDialog("teclea nombre1");
        int peso1 = Integer.parseInt(JOptionPane.showInputDialog("teclea peso1"));
        String nome2 = JOptionPane.showInputDialog("teclea nombre2");
        int peso2 = Integer.parseInt(JOptionPane.showInputDialog("teclea peso2"));
        obx.peso(nome1, peso1, nome2, peso2);
    }
}
