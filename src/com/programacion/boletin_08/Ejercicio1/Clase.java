package com.programacion.boletin_08.Ejercicio1;

import javax.swing.JOptionPane;



public class Clase {


    private String producto;
    private float cantidad;

    public void necesidad(){
        producto = lerProducto();
        cantidad = lerCantidad();
        while(cantidad != 0){


            if (cantidad <= 500) {
                if (cantidad <=100) {
                    System.out.println(producto + "_______" + "Baja necesidad");


                }
                else{
                    System.out.println(producto + "_______" + "Necesidad media");
                }
            }
            else{
                if (cantidad < 1000) {
                    System.out.println(producto + "_______" + "Necesadid alta");
                }
                else{
                    System.out.println(producto + "_______" + "Primera necesidad");
                }
            }

            producto = lerProducto();
            cantidad = lerCantidad();
        }
        System.out.println("Saioos do while");
    }

    public String lerProducto(){
        producto =JOptionPane.showInputDialog("teclea producto");
        return producto;
    }
    public float lerCantidad(){
        cantidad =(float) (Integer.parseInt(JOptionPane.showInputDialog("teclea cantidad")));
        return cantidad;
    }


}
