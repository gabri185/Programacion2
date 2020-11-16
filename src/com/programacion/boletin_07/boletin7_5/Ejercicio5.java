package com.programacion.boletin_07.boletin7_5;

import javax.swing.JOptionPane;


public class Ejercicio5 {
    public static void main(String[] args) {

        clases obx = new clases();
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        int n3 = Integer.parseInt(JOptionPane.showInputDialog("teclea numero"));
        obx.mayor(n1, n2, n3);
    }
}
