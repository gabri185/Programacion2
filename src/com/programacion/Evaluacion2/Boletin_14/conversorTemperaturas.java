package com.programacion.Evaluacion2.Boletin_14;

public class conversorTemperaturas {

        public static final float TEMPERATURA_MINIMA =80F;

        public conversorTemperaturas() {
        }
        public float centigradosAFarenheit(float temperaturaCentigrados) throws TemperaturaErradaException{
            if (temperaturaCentigrados<TEMPERATURA_MINIMA)
                throw new TemperaturaErradaException("Introduzca una temperatura superior a 80º");
            else {
                return (temperaturaCentigrados * 1.8F) + 32.4F;
            }
        }
        public void centigradosAReamur (float celsius){
            try {
                float temperaturaReamur=0.8F*celsius;
                if (celsius<TEMPERATURA_MINIMA) {
                    throw new TemperaturaErradaException();
                }
                System.out.println("temperatura en celsius= " + temperaturaReamur);
            }catch (TemperaturaErradaException es){
                System.out.println(es.getMessage());
            }
        }

}
