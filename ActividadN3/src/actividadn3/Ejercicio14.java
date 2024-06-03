
package actividadn3;
import java.util.Random;
/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio14 {

    /**
     * 14. Realizar un programa que genere un arreglo de 50 posiciones y se 
     * rellene de con la funcion ramdom de java (los numero deben ser 1 a 99)
     * Luego de llenar hacer la impresión de la matriz. 
     */
    public static void main(String[] args) {

        // Definir el tamaño del arreglo
        int tamaño = 50;

        // Crear el arreglo
        int[] arreglo = new int[tamaño];

        // Crear una instancia de la clase Random
        Random rand = new Random();

        // Rellenar el arreglo con números aleatorios entre 1 y 99
        System.out.println("Arreglo de 50 posiciones con numeros aleatorios entre 1 y 99:");

        for (int i = 0; i < tamaño; i++) {
            arreglo[i] = rand.nextInt(99);
            System.out.print(arreglo[i] + " ");
        }

    }
    
}
