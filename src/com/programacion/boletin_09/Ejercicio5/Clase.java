package com.programacion.boletin_09.Ejercicio5;

import javax.swing.JOptionPane;


public class Clase {

    int soldo;
    float trabajadores1;
    float trabajadores2;

    public void porcentaje(){
        trabajadores1 = 0;
        trabajadores2 = 0;
        soldo =(int) Float.parseFloat(JOptionPane.showInputDialog("teclea soldo "));

        while(soldo != 0){
            if (1000<=soldo && soldo<=1750) {
                trabajadores1 ++;

            }
            else{
                trabajadores2 ++;
            }

            soldo =(int) Float.parseFloat(JOptionPane.showInputDialog("teclea soldo "));
        }
        System.out.println("Saliste do while");
        System.out.println("Trabajadores ganan menos 1000 =" + trabajadores2);
        System.out.println("Trabajadores ganan mas 1000 =" + trabajadores1);
        System.out.println("Porcentaje trabajadores menos 1000 =" + trabajadores2/(trabajadores1 + trabajadores2)*100 + "%");
    }
}

