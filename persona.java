package edu.pucp.personal.model;
public static class persona {
    int edad;
    String nombre;
    double sueldo;
    public persona(String nombre, int edad, double sueldo){
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    String getnombre(){
        return nombre;
    }
    int getedad(){
        return edad;
    }
    double sueldo(){
        return sueldo;
    }
}
