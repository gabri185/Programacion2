package com.programacion.Evaluacion2.Boletin_12;

import javax.swing.JOptionPane;

public class Garaxe {
    public float numeroCoches;
    public float tempo = Integer.parseInt(JOptionPane.showInputDialog("Cuanto tiempo estaciono?"));
    public String coche;
    public float nPlazas;
    public double precio;




    public double calcularPrezo(){

        if(tempo > 3){
            return precio= ((tempo - 3) * 0.20) +1.50;
        }else{
            return precio= 1.50;
        }

    }
}
