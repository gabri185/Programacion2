package com.programacion.boletin_07.boletin7_1;

import javax.swing.JOptionPane;


public class Ejercicio1 {
    public static void main(String[] args) {

        clases obx = new clases();
        int numero = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        obx.amosarPositivo(numero);
    }


}
