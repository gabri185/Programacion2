package com.programacion.boletin_08.Ejercicio2;

import javax.swing.JOptionPane;


public class Clase {
    float altura;
    float base;
    int opcion;
    float cuadrado;
    float rectangulo;
    float triangulo;

    public void menu(){
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triangulo");
        System.out.println("4. Salir");

        System.out.println("Escribe una de las opciones");
        opcion = Integer.parseInt(JOptionPane.showInputDialog("teclea opcion"));
        altura =(float) (Integer.parseInt(JOptionPane.showInputDialog("teclea altura")));
        base =(float) (Integer.parseInt(JOptionPane.showInputDialog("teclea base")));
        if(opcion >= 1 |opcion <= 4){
            switch(opcion){
                case 1:
                    System.out.println("Has seleccionado Cuadrado");
                    cuadrado = altura * base;
                    System.out.println("cuadrado =  " + "_____" + cuadrado);
                    break;
                case 2:
                    System.out.println("Has seleccionado Rectangulo");
                    rectangulo = altura * base;
                    System.out.println("rectangulo =  " + "_____" + rectangulo);
                    break;
                case 3:
                    System.out.println("Has seleccionado Triangulo");
                    triangulo = (altura * base)/2;
                    System.out.println("triangulo =  " + "_____" + triangulo);
                    break;
                case 4:
                    System.out.println("Saliste");
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }
        }
        else{
            System.out.println("Dato erroneo");
        }


    }
}

