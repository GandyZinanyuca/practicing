package edu.pucp.personal.model;
public class empleado extends persona {
    int idEmpleado;
    int contador =1;
    public Empleado(String nombre, int edad, double sueldo){
        super(nombre, edad, sueldo);
        this.idEmpleado=contador++;

    }
    public void muestraDatos(){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+edad);
        System.out.println("sueldo: "+sueldo);
        System.out.println("idEmpleado: "+idEmpleado);
    }
}
