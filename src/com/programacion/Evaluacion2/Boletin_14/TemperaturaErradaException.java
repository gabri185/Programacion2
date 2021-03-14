package com.programacion.Evaluacion2.Boletin_14;

public class TemperaturaErradaException {

        public TemperaturaErradaException(){
            super("La temperatura no puede ser inferior a 80º ");
        }
        public TemperaturaErradaException(String mensaje){
            super(mensaje);
        }

}
