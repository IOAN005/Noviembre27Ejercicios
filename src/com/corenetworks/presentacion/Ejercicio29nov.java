package com.corenetworks.presentacion;

import java.util.Scanner;

public class Ejercicio29nov {
    public static void main(String[] args) {
        int tabla=5 ;
        Scanner teclado=new Scanner(System.in);
        System.out.println("escriba un  nunmero");

        tabla=teclado.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(i+" * " + tabla + " = " + tabla*i);

        }

    }
}
