package com.programacion.boletin03.Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float gradosC, gradosF, gradosK;
        System.out.println("Introduce grados Centígrados:");
        gradosC = sc.nextFloat();
        gradosF = 32 + (9 * gradosC / 5);
        System.out.println(gradosC +" ºC = " + gradosF + " ºF");
        gradosK = gradosC + 273;
        System.out.println(gradosC +" ºC = " + gradosK + " ºK");
    }
}
