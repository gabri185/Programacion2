package com.programacion.boletin06.boletin6_3;

import java.util.Scanner;

public class boletin6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circulo obxC = new Circulo();
        obxC.calcularArea();
        obxC.calcularLonxitude();

        Circulo obxC2 = new Circulo(3,3);
        obxC2.calcularArea();
        obxC2.calcularLonxitude();
        System.out.println("area =" + obxC2.calcularArea());
    }
}
