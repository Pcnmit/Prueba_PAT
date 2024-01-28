/*
En la ciudad de Ónera, Misiones se realizo año a año la "Maraton del Inmigrante" 
en el marco de la Fiesta Nacional del Inmigrante.
El evento cuenta con un día de inscripciones el día anterior a la carrera, 
por lo que se desconoce la cantidad exacta de inscriptos que puede llegar a haber.
Desde la Federación de Colectividades (Organismo que organiza), manifestaron que se 
solicitan los siguientes datos para la inscripcion de cada participante: dni, nombre y edad.

En cuanto a las categorías posibles para una inscripción, se manejan las siguientes:

Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos Mayores (mayores de 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de cada participante, 
se muestre por pantalla a qué categoría
debe ser incripto. Cabe destacar que, al finalizar el día, para dar fin a las inscripciones, 
se debe ingresar un dni con el valor 0
y que nombre con la palabra "Fin".
 */
package EjercicioLogica;

import java.util.Scanner;


public class MaratonInmigrante {
    public static void main(String[] args) {
            //Pedir datos a las personas,dni, nombre y edad.
            //Determinar a qué categoria se tiene que inscribir.
            //Informarle a la persona.
            //No sabemos la cantidad de personas.

    //dni
        System.out.println("Ingrese el dni de la persona: ");
        Scanner teclado = new Scanner(System.in);
        String dni = teclado.nextLine();
        
        //nombre
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = teclado.nextLine();
        
        //edad
        System.out.println("Ingrese la edad de la persona: ");
        Scanner teclado2 = new Scanner(System.in);
        int edad = teclado2.nextInt();
        
        
        while(!dni.equals("0") || !nombre.equalsIgnoreCase("fin")){ //Mientrs el dni no sea igual a cero 
            
            if(edad >=6 && edad<=10) {
                System.out.println("La categoria es Menores A: ");
            }
            else {
                if(edad >=11 && edad<=17) {
                    System.out.println("La categoria es Menores B: ");
                }
                else {
                    if(edad >=18 && edad <=30) {
                        System.out.println("La categoria es Juveniles");
                    }
                    else {
                        if(edad >=31 && edad <=50){
                            System.out.println("La categoria es Adultos");
                        }else {
                            if(edad >=51){
                                System.out.println("La categoria es Adultos Mayores");
                            }else {
                                System.out.println("La persona no cuenta con la edad indicada");
                            }
                        }
                    }
                }
                
                //Aca volvemos a pedir los datos 
                System.out.println("Ingrese el dni de la persona");
                dni = teclado.next();
                System.out.println("Ingrese el nombre de la persona");
                nombre = teclado.nextLine();
                System.out.println("Ingrese la edad de la persona");
                edad = teclado2.nextInt();
            }
        }
    
    }
   
    
    
}
