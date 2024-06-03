
package actividadn3;
import java.util.Scanner;
/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio15 {

    /**
     * 15. Realizar un programa que genere una matriz 5*6 y se rellena 
     * dinamicamente con los numeros impares partiendo desde n (n es dada por el 
     * usuario)y se imprima.
     */
    public static void main(String[] args) {
        // Definir el tamaño de la matriz
        int filas = 5;
        int columnas = 6;

        // Crear la matriz
        int[][] matriz = new int[filas][columnas];

        // Crear un escáner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número inicial n
        System.out.print("Ingrese el numero inicial (n): ");
        int n = scanner.nextInt();

        // Si n es par, incrementar n en 1 para que sea impar
        if (n % 2 == 0) {
            n++;
        }

        // Rellenar la matriz con números impares empezando desde n
        int numeroImpar = n;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = numeroImpar;
                numeroImpar += 2; // Incrementar para obtener el siguiente número impar
            }
        }

        // Imprimir la matriz
        System.out.println("Matriz 5x6 rellenada con numeros impares partiendo desde " + n + ":");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
