
package actividadn3;

import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio12 {

    /**
     * 12. Realizar un programa que genere una matriz 5x5, inicializarla 
     * en 2 e imprimirla. 
     */
    public static void main(String[] args) {
      int filas = 5;
        int columnas = 5;

        // Creacion de la matriz
        int[][] matriz = new int[filas][columnas];

        // Inicializar la matriz con el valor 2
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = 2;
            }
        }

        // Imprecion de la matriz
        System.out.println("Matriz 5x5 inicializada con el valor 2:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }   
        
        
    }
    
}
