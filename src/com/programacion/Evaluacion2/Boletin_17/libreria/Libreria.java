package com.programacion.Evaluacion2.Boletin_17.libreria;
import libreriaGabriel.PedirDatos;
import libreriaGabriel.ValidarDatos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Libreria {
    public static ArrayList<Libro> listaLibros = new ArrayList<>();


    public static void añadirLibros() {
        Libro libroAñadir = pedirLibro();
        listaLibros.add(libroAñadir);
    }


    public static void venderLibros(ArrayList listaLibros) {
        if (listaLibros == null || listaLibros.isEmpty()) {
            throw new RuntimeException("La lista esta vacía");

        } else {
            int encontrado = 0; // El libro no está en la lista
            String libro_A_Borrar = PedirDatos.pedirString("ISBN del libro");
            Iterator it = listaLibros.iterator();

            while (it.hasNext()) {
                Libro libro = (Libro) it.next();
                if (libro_A_Borrar.equalsIgnoreCase(libro.getISBN())) {
                    encontrado = 1;
                    JOptionPane.showMessageDialog(null, "Libro " + libro.getTitulo() + " con ISBN " + libro.getISBN() + " vendido");
                    libro.setNumeroUnidades(libro.getNumeroUnidades() - 1);
                    if (comprobarUnidades(libro) == 0) {
                        String[] botones = {"Hacer pedido libro", "Baja libro", "Libro a 0"};
                        int opcion = JOptionPane.showOptionDialog(null, "Atención, nos quedamos sin stock de este libro", "Stock vacío", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                        switch (opcion) {
                            case 0:
                                int cantidadComprar = ValidarDatos.validarIntMenorQueCero("Unidades a reponer");
                                libro.setNumeroUnidades(cantidadComprar);
                                break;

                            case 1:

                                it.remove();
                                JOptionPane.showMessageDialog(null, "Libro borrado de sistema");
                                break;


                            case 2:
                                JOptionPane.showMessageDialog(null, "El libro continua en sistema pero sin Stock");
                                break;


                        }
                    }
                }
            }
            if (encontrado == 0) {
                JOptionPane.showMessageDialog(null, "Libro no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


    public static void mostrarLibros(ArrayList listaLibros) {
        if (listaLibros == null || listaLibros.isEmpty()) {
            throw new RuntimeException("La lista esta vacía");

        } else {
            Libro lib;
            Collections.sort(listaLibros, new LibroComparator()); // Ordena la lista de libros creando un nuevo LibroComparator
            Iterator it = listaLibros.iterator();
            System.out.println("Libros en nuestra librería: \n");
            while (it.hasNext()) {
                lib = (Libro) it.next();
                System.out.println("Libro :" + lib);
            }
        }
    }


    public static int comprobarUnidades(Libro libro) {
        int unidades = libro.getNumeroUnidades();
        return unidades;
    }


    public static void buscarLibro(ArrayList listaLibros) {
        if (listaLibros == null || listaLibros.isEmpty()) {
            throw new RuntimeException("La lista esta vacía");

        } else {
            int encontrado = 0;
            String libroBuscado = PedirDatos.pedirString("Libro que desea buscar");
            Iterator it = listaLibros.iterator();
            while (it.hasNext()) {
                Libro lib = (Libro) it.next();
                if (libroBuscado.equalsIgnoreCase(lib.getTitulo())) {
                    encontrado = 1;
                    JOptionPane.showMessageDialog(null, "Libro encomtradp:\n" +
                            lib);
                }
                if (encontrado == 0)
                    JOptionPane.showMessageDialog(null, "Libro no está en nuestra librería");
            }
        }
    }


    public static Libro pedirLibro() {
        String titulo = PedirDatos.pedirString("Titulo del libro a añadir");
        String autor = PedirDatos.pedirString("Autor del libro");
        float precio = ValidarDatos.validarFloatMenorQueCero("Precio del libro");
        int numeroUnidades = ValidarDatos.validarIntMenorQueCero("Número de unidades");
        Libro libro = new Libro(titulo, autor, precio, numeroUnidades);
        return libro;
    }
}
