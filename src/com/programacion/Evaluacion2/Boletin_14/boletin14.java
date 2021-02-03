package com.programacion.Evaluacion2.Boletin_14;

public class Boletin14 {
    public static void main(String[] args) {
        conversorTemperaturas temperatura1 = new conversorTemperaturas();
        conversorTemperaturas temperatura2 = new conversorTemperaturas();
        try {
            System.out.println("Estos grados son en Farenheit "+temperatura1.centigradosAFarenheit(78));
        }catch (TemperaturaErradaException error){
            System.out.println(error.getMessage());
        }

        temperatura2.centigradosAReamur(46F);
    }
}
