package com.programacion.boletin_09.Ejercicio1;

import javax.swing.JOptionPane;

 class clases {
    float positivos;
    float ceros;
    float negativos;





    public void cantidade(){


        for (int i = 0; i < 10; i++) {

            float numero = Float.parseFloat(JOptionPane.showInputDialog("teclea numero "));



            if(numero >= 0){
                if(numero == 0){
                    ceros ++;

                }else{
                    positivos ++;
                }


            }else{
                negativos ++;
            }
            System.out.println("Positivos = " + positivos + "\n Negativos = " + negativos + "\n Ceros = " + ceros);
        }
    }
}