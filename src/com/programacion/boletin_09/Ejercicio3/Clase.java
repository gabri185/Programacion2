package com.programacion.boletin_09.Ejercicio3;

 class Rectangulo {
    float base,altura;
    public Rectangulo() {
    }

    public Rectangulo(float b,float a){
        base = b;
        altura=a;
    }

    public void setBase(float base){this.base = base;}

     public void setAltura(float altura){this.altura = altura;}

     public  float calcularArea(){return (base*altura);}
}
