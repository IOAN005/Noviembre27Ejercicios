package com.corenetworks.presentacion;

public class Ejercicio7 {
    public static void main(String[] args) {
        //Hallar todas las tablas de multiplicar con for anidados
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println();
            System.out.println("tabla del " + i);
            System.out.println();
            for (int j = 1; j <= 10; j = j + 1) {
                System.out.println(i + "x" + j + "=" + (i * j));


            }
        }
        }
    }