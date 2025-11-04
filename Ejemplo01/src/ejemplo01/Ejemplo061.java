/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {

    public static void main(String[] args) {
        // Uso de printf
        // f: formato


        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        String nombre = "Mateo";
        String apellido = "Jaramillo";
        int edad = 17;
        String direccion = "Daniel Alvarez";
        String universidad = "UTPL";
        String ciclo = "Primer Ciclo";
        String asignatura = "Introduccion a la programación";
        String paralelo = "A";

        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:\n\t%s\nDirección:\n\t%s\nUniversidad:\n\t%s\nCiclo:\n\t%s\nAsignatura:\n\t%s\nParelo:\n\t%s\n",nombre, apellido,edad,direccion,universidad,ciclo,asignatura,paralelo);

    }
}
