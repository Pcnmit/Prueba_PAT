/*
Una compañia de vuelos cuenta con 6 destinos a los que realiza 3 vuelos diariamente, 
uno por la mañana, otroa al mediodida y otro por la noche. Para administrar estos datos,
utilizar una matriz, donde cada fila es un destino y en cada columna se guarda la cantidad de asientos
disponibles-

i.- Se necesita un programa que permita la carga de la matriz con la cantidad de asientos para cada vuelo

ii.- Al mismo tiempo, el programa debe permitir a un usuario ingresar el número de destino al 
que quiere dirigirse, el número de vuelo(dependiendo si quiere viajar a la mañana, al mediodia o a la noche) 
y la cantidad de pasajes que necesita.

iii.- A partir de la solicitud del usuario, el progrmaa debe controlar si hay la cantidad suficiente 
de asientos para la cantidad de 
pasajes que se requiere. En caso de que asi sea, se debe mostrar un cartel por pantalla que diga 
"su reserva fue realizada con 
éxto" y se debe descontar del total de asientos los solicitados por el usuario. En caso
de no haber mas asientos disponibles, se debe
informar otro cartel que diga "disculpe", no se pudo completar su operación dado que no hay asientos disponibles.

Desde la compañia de vuelos manifiestan que NO CONOCEN cuantas veces/reservas se hacen por día. Por lo 
cual, para finalizar las ventas
se ingresa la palabra "finish"
 */
package ArraysVectoresyMatrices;

import java.util.Scanner;


public class EjerciciosAerolineas {
    
    public static void main(String[] args) {
        
        //creamos la matriz
        int vuelos[][] = new int [6][3];
        
        //Cargamos la matriz
        Scanner teclado = new Scanner(System.in);
        
        for(int f=0; f<6; f++){
            for(int c=0; c<3; c++){
                System.out.println("Ingrese la cantidad de asientos para el destino: " + f + " horario: " + c);
                vuelos[f][c] = teclado.nextInt();
            }
        }
        
        //Venta de asientos
        Scanner teclado2 = new Scanner(System.in);
        String bandera = "";
        int destino, horario, asientos;
        
        while(!bandera.equalsIgnoreCase("finish")){
            System.out.println("Ingrese el n° de destino");
            destino = teclado.nextInt();
            System.out.println("I)ngrese el horario de vuelo");
            horario = teclado.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado.nextInt();
            
            
            if (destino >= 0 && destino <= 5) {
                if (horario >= 0 && horario <= 2) {

                    if (vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con éxito");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos;
                    } else {
                        System.out.println("No hay asientos disponibles");
                    }

                } else {
                    System.out.println("Horario no existente. Ingrese entre 0 y 2 ");
                }

            } else {
                System.out.println("Destino no existente. Ingrese entre 0 y 5 ");

            }
            System.out.println("¿Desea continuar reservando?. Ingrese finish para terminar "
                    + "o cualquier valor para seguir");
            bandera = teclado2.next();
        }

    }

}


