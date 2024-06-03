
package actividadn3;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio13 {

    /**
     * 13. Realizar un programa que genere una matriz 7*7, inicializarla la
     * diagonal principal con el numero "0"(cero), el resto de las posiciones 
     * deben ser - (guion). Imprimir la matriz.
     */
    public static void main(String[] args) {
        
        int tamaño = 7;

        // Creacion de la matriz
        String[][] matriz = new String[tamaño][tamaño];

        // Inicializar la matriz
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                if (i == j) {
                    matriz[i][j] = "0";  // Diagonal con 0
                } else {
                    matriz[i][j] = "-";  // Resto de posiciones con guion
                }
            }
        }

        // Imprecio de la matriz
        System.out.println("Matriz 7x7 inicializada:");
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }
    
}
