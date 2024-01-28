/*
Una pequeña despensa desea calcular los sueldos de sus empleados. Los puestos
de los mismos pueden tener 3 categorias: 1 - repositor, 2 - cajero, 3 - supervisor.

-Los repositores cobraran $15,890. + un bono del 10%
-Los cajeros cobran $25,630.89 fijos
-Los supervisores cobran $35,560.20 en bruto al cual se le descuentan un 11% de jubilacion.

Se necesita un programa que, dependiendo del tipo de empleado del que se trate, calcule y muestre en pantalla
el correspondiente sueldo.
 */
package EjercicioLogica;

import java.util.Scanner;

/** 
 *
 * @author HP
 */
public class IntegradorCondicionales {
    
    public static void main(String[] args) {
        
        double sueldo=0;
        int categoria;
        
        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();
        
        if(categoria==1){
            sueldo = 15890 + (15890*0.10);
        }else {
            if(categoria==2){
                sueldo = 25630.89;
            }else {
                if(categoria==3){
                    sueldo = 35560.20 + (35560.20*0.11);
                }else {
                    System.out.println("Ingrese un número de categoria válido");
                }
            }
                    
        }
        
        if(categoria==1 || categoria==2 || categoria==3){
        System.out.println("El total del sueldo para la categoria seleccionada " + categoria + " es igual a: " + sueldo);
        }
    }
    
}
