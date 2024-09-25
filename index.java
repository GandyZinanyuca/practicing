package edu.pucp.recursos.main.model;
import edu.pucp.personal.model.persona;
import edu.pucp.personal.model.empleado;
public static void main(String[] args) {
    System.out.println("nuevas actualizaciones");
    empleado personal1 = new empleado("elias", 34, 78.5,1);
    personal1.muestraDatos();
}