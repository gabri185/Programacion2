package com.programacion.boletin_09.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Rectangulo obx = new Rectangulo();
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Introduce la base");
            obx.setBase(sc.nextFloat());
        }while(base<=8);
        do{
            System.out.println("Introduce la aultura");
            obx.setAltura(sc.nextFloat());


        }while (altura<=8);
        System.out.println("El área del rectangulo es"+obx.calcularArea());
    }

}
