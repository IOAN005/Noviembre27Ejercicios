package com.corenetworks.presentacion;

import com.corenetworks.modelo.Persona;

import java.time.Period;
import java.time.Year;

public class TestPersona {
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.setEdad(34);

        System.out.println("la edad en dias es "+ p1.calcularEdadDias());
        Persona p2=new Persona(22);
        System.out.println("La edad en segunos es " +p2.calcularEdadSegundos());



    }
}
