    /*
En tres vectores diferentes se guardan los nombres, temperaturas minimas y maximas de 5 ciudades 
de la provincia de Misiones.
En el primer vector se guardan los nombres de las ciudades, en el segundo las temperaturas mínimas
alcanzadas y en el tercero las
temperaturas máximas alcanzadas en la últijma semana. Se necesita un programa que permita la carga de 
las ciudades, sus temperaturas
mínimas y máximas, además, deberá poder informar por pantalla cual fue la ciudad con la temperatura más baja
y cual con la
temperatura más alta (dando a conocer al mismo tiempo la cantidad de grados)
 */
package ArraysVectoresyMatrices;

import java.util.Scanner;
public class TemperaturasCiudades {
    public static void main(String[] args) {
        
        //Creamos los vectores
        String ciudades[] = new String[5];
        Double minimas[] = new Double[5];
        Double maximas[] = new Double[5];
        
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);


        //Cargamos los vectores
        for (int i=0; i<ciudades.length; i++){
            System.out.println("Ingrese el nombre de la ciudad: " + i);
            ciudades[i] = teclado.next();
            
            System.out.println("Ingrese la minima de la ciudad: " + i);
            minimas[i] = teclado2.nextDouble();
            
            System.out.println("Ingrese la maxima de la ciudad: " + i);
            maximas[i] = teclado2.nextDouble();
                   
        }
        
        Double minima = 9999999.00;
        int posMin = -1;
        
        //Determinamos la minima
        for(int i=0; i<minimas.length;i++){
            
            if(minimas[i] < minima){
                minima = minimas[i];
                posMin = i;
            }
            
        }
        
        Double maxima = -9999999.00;
        int posMax = -1;
        
        //Determinamos las maximas
        for(int i=0; i<maximas.length; i++){
            
            if(maximas[i] > maxima){
                maxima = maximas[i];
                posMax = i;
            }
        }
        
        System.out.println("La temperatura mínima es de: " + minima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMin]);
        System.out.println("La temperatura máxima es de: " + maxima);
        System.out.println("Se registró en la ciudad de: " + ciudades[posMax]);
    }
    
}
