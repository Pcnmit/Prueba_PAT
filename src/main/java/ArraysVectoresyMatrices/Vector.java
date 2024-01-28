/*
Realizar un programa que permite cargar 15 números en un vector. Una vez cargados, se necesita que el programa
cuente e informe por pantalla cuántas veces se cargó el número 3
 */
package ArraysVectoresyMatrices;

import java.util.Scanner;


public class Vector {
    public static void main(String[] args) {
        
        int vector[] = new int[15];
        Scanner teclado = new Scanner(System.in);
        
        
        //Cargar nuestro vector
        for(int i=0; i<15; i++){
            System.out.println("Ingrese un número para el vector");
            vector[i] = teclado.nextInt();
        }
        
        //recorrer y contar cúantos números 3 hay
        int cont = 0; //Inicializamos un contador una variable que nos diga ahi un 3 etc
        
        for(int i=0; i<15; i++){
            
            if(vector[i] == 3){
                cont = cont + 1;
            }
        }
        
        System.out.println("La cantidad de números 3 que hay en el vector es: " + cont);
    }
    
}
