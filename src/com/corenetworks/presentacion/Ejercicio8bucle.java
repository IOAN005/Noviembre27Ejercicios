package com.corenetworks.presentacion;

public class Ejercicio8bucle {
    public static void main(String[] args) {
        //Con los 20 primeros números decir con cada uno por cual es divisible:
        //ejemplo: 1 --> es divisible por 1
        //2 --> es divisible por 1
        //es divisible por 2 ...
       for (int i=1;i<=20;i++){
           System.out.println("  el numero" +i);
           for (int j=1;j<=i;j++){
               if (i%j==0){
                   System.out.println(i + " es divisible " + j);
               }
           }
       }
    }
}
