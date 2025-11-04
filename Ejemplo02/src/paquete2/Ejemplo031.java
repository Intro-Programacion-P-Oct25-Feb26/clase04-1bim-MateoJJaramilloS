/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo031 {
    public static void main(String[] args) {
        // Ingreso de datos por teclado
        // uso de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int nacimiento;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine(); // nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese el año de nacimiento del estudiante");
        nacimiento = entrada.nextInt();
        
        System.out.printf("Datos del estudiante\n%s\n%s\n%d\n", 
                nombre,
                apellido,
                nacimiento);
        //Cambio el último %s por el %d porque la variable es entera
    }
}
