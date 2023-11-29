package com.corenetworks.presentacion;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Esribir el factorial del numero 15
        long resultado=1L;

        int factorial =15;
        for (int i=1;i<=15;i++) {
            resultado=resultado*i;
            System.out.println(i +" " + resultado);
        }
        System.out.println(factorial+"*"+ "15" +"="+resultado);


        //Ejercicio 1 bucle while factorial de 25
        long factorial1=1;
        int numero=25;
        int j=1;


        while (j<=numero){
            factorial1=factorial1*j;
            j++;

        }
        System.out.println("el factorial de 25 es ->" + factorial1);

    }


}

