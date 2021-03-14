package com.programacion.Evaluacion2.Boletin_17.libreria;

import java.util.Comparator;

public class LibroComparator  implements Comparator<Libro> {
    @Override
    public int compare(Libro o1, Libro o2) {
        return o1.getTitulo().compareToIgnoreCase(o2.getTitulo());
    }
}
