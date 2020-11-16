package com.programacion.boletin_07.boletin7_5;

public class clases {
    public void mayor(int n1,int n2,int n3){
        if (n2 != n1 | n1 != n3 | n3 != n2 ) {
            if (n1<n2) {
                if (n2>n3) {
                    System.out.println("n2 es el mayor");

                }
                else{
                    System.out.println("n3 es el mayo");
                }
            }
            else{
                if (n1 > n3) {
                    System.out.println("n1 es el mayor");
                }
                else{

                    System.out.println("n3 es el mayor");
                }
            }
        }
        else{
            System.out.println("error");
        }

    }
}
