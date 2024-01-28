/*
 Llevar a cabo un programa que incluya un vector que almacene los nombrse: Alejandra, Leonardo, 
    Rosa, Guillermo, Gabriel, Daniel, Luisa
y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos por pantalla.
 */
package ArraysVectoresyMatrices;


public class Vectores {
    
    public static void main(String[] args) {
        
        //Tener un vector que guarde una serie de nombres 8 en total
        String vector[] = new String[8];
        
        //Asignacion manual de los valores
        vector[0] = "Alejandra";
        vector[1] = "Ludmila";
        vector[2] = "Gabriel";
        vector[3] = "Rosa";
        vector[4] = "Luisina";
        vector[5] = "Daniel";
        vector[6] = "Loky";
        vector[7] = "Lumel";
        
        //Recorrido
        for(int i=0; i<vector.length; i++){
            System.out.println("En la posición: " + i + " Esta el nombre: " + vector[i]);
        }
        
    }
    
}
