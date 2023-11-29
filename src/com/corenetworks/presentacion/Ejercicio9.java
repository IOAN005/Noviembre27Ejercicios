package com.corenetworks.presentacion;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Hallar la lista de los números primos hasta el 100
        for (int i = 1; i <= 100; i++) {

            boolean primo = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    primo = false;
                }
            }
            if (primo){
                System.out.println("es primo el numero " +i);
            }
        }
    }
}