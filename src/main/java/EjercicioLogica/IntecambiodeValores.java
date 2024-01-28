
 /*
Realizar un programa que permita el intercambio de valores entre dos variables.
Por ejemplo: Si una variable numero vale 35, y una variable numero 2 vale 20,
realizar las acciones necesarias para que numero pase a valer 20 y numero2
pase a valer 35. Una vez realizado el cambio mostrar el resultado por pantalla.
*/
package EjercicioLogica;


public class IntecambiodeValores {
    public static void main(String[] args) {
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("-----------Antes----------");
        System.out.println("Num1: " + num1);//35
        System.out.println("Num2: " + num2);//20
        
        aux = num2;//=20
        num2 = num1;//=20
        num1 = aux;//=35
        
        System.out.println("------------Después-------------------");
        System.out.println("Num1: " + num1);//20
        System.out.println("Num2: " + num2);//35
    }
    
}
