package com.programacion.Evaluacion2.Boletin_15.Ejercicio3;
import libreriaGabriel.PedirDatos;
import libreriaGabriel.ValidarDatos;
public class Metodos {
    public static void main(String[] args) {
        int[] lista = new int[Ejercicio3.Alumnos.tamanoDam];
        int contador = 0;
        for (int nota : lista) {
            do { //Valido la nota máxima, porque la mínima ya viene validada por el metodo de mi librería
                lista[contador] = ValidarDatos.validarIntMenorQueCero("Introduce la nota");
            } while (lista[contador] > 10);
            Alumnos.arrayNotas(lista); // Voy mandando al método de crear el array todos los datos que voy metiendo
            contador++;
        }
        Alumnos objetoAlumno = new Alumnos();
        objetoAlumno.arrayNombres();
        objetoAlumno.verArrayNombresyNotas();
        objetoAlumno.buscarNotaAlumnoDeterminado("juan");
        objetoAlumno.buscarNotaAlumno();
        objetoAlumno.alumnosAprobados();
        objetoAlumno.ordenarporNotas(Alumnos.notaAlumno);
        objetoAlumno.verArrayNombresyNotas();
    }
}
