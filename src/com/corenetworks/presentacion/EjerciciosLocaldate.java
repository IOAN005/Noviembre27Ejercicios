package com.corenetworks.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class EjerciciosLocaldate {
    public static void main(String[] args) {
        //Calcular la edad de una persona que nació el 3 de septiembre 1998
        LocalDate fechaNacimiento = LocalDate.of(1998, 9, 3);
        Period edad = Period.between(fechaNacimiento, LocalDate.now());
        System.out.println(edad.getYears());

        //Calcular la fecha de mañana
        LocalDate fechaDeHoy= LocalDate.now().plusDays(1);
        System.out.println(fechaDeHoy);
        // //Restar 3 meses a la fecha de final de curso 22 de marzo de 2024
        LocalDate finDeCursoMenos3Meses=LocalDate.of(2024,3,15).minusMonths(3);
        System.out.println(finDeCursoMenos3Meses);
        //Calcular los dias desde el inicio del curso
        Period diasEstudiando=Period.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(diasEstudiando.getDays());

        long diasTrascuridos= ChronoUnit.DAYS.between(LocalDate.of(2023,10,9),LocalDate.now());
        System.out.println(" dias transcurridos " + diasTrascuridos);


        String frase ="DevOps es un marco de trabajo y una filosofía en constante evolución que promueve un mejor desarrollo de aplicaciones en menos tiempo y la rápida publicación de nuevas o revisadas funciones de software o productos para los clientes.";
        //Mostrar el numero de caracteres del texto anterior
        System.out.println(frase.length());
        //Mostrar la posicion de la primera palabra DevOps
        System.out.println(frase.indexOf("DevOps"));
        //Mostrar la posicion de la ultima palabra menos
        System.out.println(frase.indexOf("menos"));
        //Mostrar el texto en mayuscula
        System.out.println(frase.toUpperCase());
        //Mostrar el texto en minúscula
        System.out.println(frase.toLowerCase());
        //Extraer la primera palabra trabajo
        //System.out.println(frase.substring(22,29));
        System.out.println("Extraer trabajo (" + frase.substring(frase.indexOf("trabajo"),frase.indexOf("trabajo")+"trabajo".length())+")");








    }
}
