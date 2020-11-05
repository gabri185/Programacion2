package com.programacion.boletin06.boletin6_1;

public class coche {
    private int velocidade;


    public coche() {
        velocidade = 0;

    }

    public int getVelocidade() {
        return velocidade;
    }

    public void acelerar(int ace){
        velocidade = velocidade + ace;
        System.out.println("Velocidade incrementa en " + ace + " KM/h");

    }

    public void frenar(int fre){
        velocidade = velocidade - fre;
        System.out.println("Velocidade disminue en " + fre + " KM/h");



    }
}

