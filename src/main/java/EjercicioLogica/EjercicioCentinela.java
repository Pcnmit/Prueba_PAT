/*
Realizar un programa que muestre en pantalla palabras
que sean ingresadas por teclado hasta que se ingrese
la palabra "Salir"
 */
package EjercicioLogica;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EjercicioCentinela {
    
    public static void main(String[] args) {
        
        //Sabemos que es un bucle
        //sabemos la condicon de salida
        //qué estructura usar
        
        System.out.println("Ingrese una palabra");
        Scanner teclado = new Scanner(System.in);
        String palabra = teclado.next();
        
        while(!palabra.equalsIgnoreCase("salir")){
            System.out.println("La palabra es: " + palabra);
            System.out.println("Ingrese una palabra");
            palabra = teclado.next();
        }
    }
    
}
