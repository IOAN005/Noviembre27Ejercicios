package com.corenetworks.presentacion;

public class Ejercicio6 {
    public static void main(String[] args) {
        //hallar los numeros impares de 30 en orden descendente

        for (int i =30;i>0;i--){
            if (i%2==1){
                System.out.println(i);
            }
        }
        //primeros 25 numeros primos

        int i=1;
        int j=2;
        int contador = 0;
        boolean primo;
        while(contador <25){
            primo= true;
            j=2;
            while(j<i){
                if(i%j==0){
                    primo=false;
                }
                j++;
            }
            if(primo==true){
                contador++;
                System.out.println(contador +"Es primo el número " + i);
            }
            i++;
        }

    }
}
