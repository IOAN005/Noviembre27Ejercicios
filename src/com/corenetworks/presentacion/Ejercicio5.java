package com.corenetworks.presentacion;

public class Ejercicio5 {
    public static void main(String[] args) {


        //Hallar 2 elevadoa8
         int resultado=1;
         for (int i=1;i<=8;i++) {
          resultado=resultado*2;


          System.out.println("en la interaction " +i+"->" +resultado);


          }
        //calcular la potencia a 2 elevado a 8 con while
        int exp = 1;
        int i = 1;
        while (i <= 8) {
            exp = exp * 2;
            System.out.println("En la iteracion " + i + " -> " + exp);
            i++;
        }
         System.out.println(exp);

    }
}
