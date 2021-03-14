package com.programacion.Evaluacion2.Boletin_16.Ejercicio1;
import libreriaGabriel.PedirDatos;


public class Numeros {
    static int[] conjuntoNumeros;
    static int[] numerosPares;
    static int[] numerosNegativos;
    static final int tamaño = 10;

    public static int[] arrayNumeros() {
        conjuntoNumeros = new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            int numero = PedirDatos.pedirInt("Introduce un número para la posición " + i);
            conjuntoNumeros[i] = numero;

        }
        return conjuntoNumeros;
    }

    public static void comprobarNumeros(int[] lista) {
        int contadorPares = 0, contadorNegativos = 0;
        for (int i = 0; i < tamaño; i++) {
            if (lista[i] % 2 == 0)
                contadorPares++;

            if (lista[i] < 0)
                contadorNegativos++;

        }
    }

}
