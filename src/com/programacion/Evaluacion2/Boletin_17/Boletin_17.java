package com.programacion.Evaluacion2.Boletin_17;

import com.programacion.Evaluacion2.Boletin_17.libreria.Libreria;

import javax.swing.*;

public class Boletin_17 {
    public static void main(String[] args) {

        String[] botones = {"Añadir libro", "Vender Libro", "Mostrar Stock", "Buscar Libro", "Salir"};

        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(null, "Selecciona opción", "Libreria Sampere", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);

            switch (opcion) {
                case 0:
                    Libreria.añadirLibros();
                    break;
                case 1:
                    Libreria.venderLibros(Libreria.listaLibros);
                    break;
                case 2:
                    Libreria.mostrarLibros(Libreria.listaLibros);
                    break;
                case 3:
                    Libreria.buscarLibro(Libreria.listaLibros);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar nuestro servicio");
                    System.exit(0);
            }

        } while (opcion != 4);

    }
}
