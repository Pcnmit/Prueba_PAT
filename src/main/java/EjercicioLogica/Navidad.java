/*
 *
  ***
 *****
*******


Filas: 4
Espacios:
	Arranca de Filas - 1
	Termina en 0

Asteriscos
	1,3,5,7,9
 */
package EjercicioLogica;

public class Navidad {
    public static void main(String[] args) {
        
        //declarar la altura del árbol
        int altura = 4;
        
        //Bucle para recorrer todas las filas (altura)
        for(int fila=0; fila<altura; fila++){
        
            //Bucle para los espacios
            
            for(int espacio=0; espacio<(altura-fila-1);espacio++){
                
                System.out.print(" ");
            }
            
            //Bucle para los asteriscos
            
            for (int asterisco=0; asterisco<(fila*2)+1; asterisco++) {
                
                System.out.print("*");
                
            }
         
             System.out.println("");
        }
        
        //Tronco
        int largoTronco = 10;
        for (int base=0; base<largoTronco; base++){
            
        }
        //Espacios en blanco
        for (int espacio=0; espacio<(altura-2); espacio++) {
                System.out.print(" ");
        }
        
        
        //barritas tronco
      for (int tronco=0; tronco<3; tronco++){
          System.out.print("|");
      }
      
        System.out.println("");
         
    }
    
      
}
