package com.programacion.boletin_07.boletin7_3;

import javax.swing.JOptionPane;


public class Ejercicio3 {
    public static void main(String[] args) {

        clases obx = new clases();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        obx.positivo(numero);
    }
}
