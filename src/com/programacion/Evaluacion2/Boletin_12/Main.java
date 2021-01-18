package com.programacion.Evaluacion2.Boletin_12;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Garaxe obxG = new Garaxe();
        Coche obxC = new Coche();


        double dineroRecibido;
        double dineroDevuelto;

        String matricula = obxC.matricula;

        if (obxG.nPlazas >= 5)
        {
            System.out.println("Completo");

        } else {
            System.out.println("Hay sitio");
            matricula = JOptionPane.showInputDialog("Escribe la matrícula");


        }

        obxG.calcularPrezo();

        dineroRecibido = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dinero"));
        dineroDevuelto = dineroRecibido - obxG.precio;


        // FACTURA
        System.out.println("FACTURA");
        System.out.println("--------");
        System.out.println("MATRICULA: "+ matricula);
        System.out.println("TIEMPO: "+ obxG.tempo);
        System.out.println("PRECIO: "+ obxG.precio);
        System.out.println("DINERO RECIBIDO "+ dineroRecibido);
        System.out.println("DINERO DEVUELTO "+ dineroDevuelto);
        System.out.println("--------");
        System.out.println("GRACIAS POR USAR NUESTRO GARAJE");
    }
}
