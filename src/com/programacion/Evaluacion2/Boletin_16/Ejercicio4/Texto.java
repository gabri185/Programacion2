package com.programacion.Evaluacion2.Boletin_16.Ejercicio4;


import java.util.Locale;

public class Texto {
    static String texto = "javeros";

    public static String cambiar_A_Mayusculas() {
        texto = texto.toUpperCase(Locale.ROOT);
        return texto;
    }

    public static String cambiar_A_Minusculas() {
        texto = texto.toLowerCase(Locale.ROOT);
    }

}
