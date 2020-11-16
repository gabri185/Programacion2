package com.programacion.boletin_07.boletin7_4;

public class clases {
    public void peso(String nome1,double peso1, String nome2, double peso2){
        if (peso1 > peso2) {
            System.out.println(nome1 + "\n peso = " + peso1 + "\n diferencia de peso =  " + (peso1 - peso2) + "kg");

        }else{System.out.println(nome2 + "\n peso = " + peso2 + "\n diferencia de peso =  " + (peso2 - peso1) + "kg");}
    }
}

