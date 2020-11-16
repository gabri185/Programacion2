package com.programacion.boletin_07.boletin7_2;

import javax.swing.JOptionPane;


public class Ejercicio2 {
    public static void main(String[] args) {

        clases obx = new clases();
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        obx.calcular(numero1,numero2);
    }

}
