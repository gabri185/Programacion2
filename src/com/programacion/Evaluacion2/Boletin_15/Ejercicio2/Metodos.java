package com.programacion.Evaluacion2.Boletin_15.Ejercicio2;
import libreriaGabriel.ValidarDatos;
public class Metodos {
    public static void main(String[] args) {
        Alumnos objetoAlumno = new Alumnos();
        int[] lista = new int[Alumnos.tamanoDam];
        int contador = 0;
        for (int nota : lista) {

            lista[contador] = ValidarDatos.validarIntMenorQueCero("Notas");
            Alumnos.arrayNotas(lista);
            contador++;
        }
        // llamo a los métodos.
        objetoAlumno.aprobadosSuspensos();
        objetoAlumno.notamediaClase();
        objetoAlumno.notaMayor();
    }
}
