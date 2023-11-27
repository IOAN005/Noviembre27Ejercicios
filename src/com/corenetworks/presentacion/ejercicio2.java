package com.corenetworks.presentacion;

import java.time.Period;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {


        byte b =1;
        System.out.println(" 1 Este tipo de dato es -> byte");

        short s=4;
        System.out.println("2 Este tipo de dato es -> short");

        int i =5;
        System.out.println("3 Este tipo de dato es -> int");

        long l=3000L;
        System.out.println("4 Este tipo de dato es -> long ");

        float f = 1_200.00F;
        System.out.println("5 Este tipo de dato es -> float");

        double d=1_500;
        System.out.println("6 Este tipo de dato es ->double");

        char volcal='a';
        System.out.println("7 Este tipo de dato es -> char");

        boolean nieve=false;
        System.out.println("8 Este tipo de dato es ->boolean");

        //Ejercicio 4
        int numero=23;
        if (numero %2==0){
            System.out.println("El numero"+numero+" es par ");
        }else {
            System.out.println("El numero "+ numero +" es impar");
        }
        //EJERCICIO5
        int numero1 =5;
        int numero2 =8;
        if (numero2>numero1){
            System.out.println("El numero mayor es " +numero2);
        }else{
            System.out.println(numero1);
        }
        //Ejercicio 6
        int num1=1;
        int num2 =5;
        int num3=4;
        if(num1>num2&&num1>num3){
            System.out.println("El numero mas mayor es " +num1);
        } else if (num2>num1&&num2>num3) {
            System.out.println("El numero mayor es "+num2);


        }else {
            System.out.println("El numero mayor es " +num3);
        }
        //7ejercicio
        double capital = 1_000;
        double redito = 0;
        int tiempo = 70;

        if(tiempo <= 24){
            redito = 0.05;
        }else if(tiempo <=60){
            redito=0.8;
        }else {
            redito = 0.1;
        }
        System.out.println(capital*redito*tiempo);

        //Ejercicio8
        int num = 1;
        if(num%2==0 && num%3==0){
            System.out.println("Es par y multiplo de 3");
        }else if(num%2!=0 && num%3==0){
            System.out.println("Es impar y multiplo de 3");
        }else if(num%2==0 && num%3!=0){
            System.out.println("No es multiplo de 3 pero es par");
        }else {
            System.out.println("No es ni par ni multiplo de 3");
        }
        //Ejercicio9
        double sueldo = 12_000;
        double incremento = 0;
        char genero = 'M';
        int numhijos = 2;

        if(sueldo <15_000){
            incremento = 0.15;
        }else{
            incremento = 0.12;
        }
        if(genero=='M'){
            incremento += 0.02;
        }
        System.out.println("Incremento -> " + incremento);
        incremento += numhijos*0.01;

        System.out.println("El porcentaje de incremento -> " + incremento);
        System.out.println("El sueldo es -> " + sueldo*(1+incremento));




    }

}
