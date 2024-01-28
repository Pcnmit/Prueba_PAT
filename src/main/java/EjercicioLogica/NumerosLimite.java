/*
Realizar un programa que dado por teclado un limite numerico
por teclado (por ejemplo 100) muestre en pantalla todos
los numeros hasta ese limite (empezando por 1)
 */
package EjercicioLogica;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class NumerosLimite {
    
    public static void main(String[] args) {
        //Tenemos un limite hasta el que tenemos que ingresar
        //ingresar ese limite
        
        System.out.println("Ingrese el límite hasta el que quiera contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int cont = 1;
        
        while(cont <= limite){
            System.out.println(cont);
            cont = cont + 1;
            //o puede ser cont++
        }
        
    }
    
}
