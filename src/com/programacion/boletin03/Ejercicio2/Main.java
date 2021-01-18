package com.programacion.boletin03.Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dinero, billetes100, billetes20, billetes5, monedas1;
        int resto100, resto20, resto5;
        System.out.println("Introduce a cantidade de diñeiro:");
        dinero = sc.nextInt();
        billetes100 = dinero/100;
        resto100 = dinero%100;
        billetes20 = resto100/20;
        resto20 = resto100%20;
        billetes5 = resto20/5;
        resto5 = resto20%5;
        monedas1 = resto5/1;

        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Billetes de 20: " + billetes20);
        System.out.println("Billetes de 5: " + billetes5);
        System.out.println("Moedas de 1: " + monedas1);
    }
}
