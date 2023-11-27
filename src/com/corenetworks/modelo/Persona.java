package com.corenetworks.modelo;
public class Persona {
    int edad;
    public int calcularEdadDias(){
       return edad*365;
    }
    public int calcularEdadSegundos(){
        return edad*86400;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                '}';
    }

    public Persona() {
    }

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public int setEdad(int edad) {
        this.edad = edad;
        return edad;
    }
}

