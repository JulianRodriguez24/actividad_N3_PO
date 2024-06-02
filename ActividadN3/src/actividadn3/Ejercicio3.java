
package actividadn3;
import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio3 {

    /**
     * 3. Hacer un programa en Java que, dado un rango, por el usuario, se da
     * númeroinicial y uno final (tomar en cuenta que el inicial debe ser menor 
     * que el final, hacerla validación y volver a pedir los dos números si no 
     * cumple la condición) y sumelos números pares dentro del rango incluyendo
     * el valor inicial y final. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start, end;

        // Solicita al usuario que ingrese el rango y valida que el inicial sea menor que el final
        while (true) {
            System.out.print("Ingrese el numero inicial: ");
            start = scanner.nextInt();
            System.out.print("Ingrese el numero final: ");
            end = scanner.nextInt();
            
            if (start < end) {
                break;
            } else {
                System.out.println("El numero inicial debe ser menor que el numero final. Por favor, intente de nuevo.");
            }
        }
        
        int sum = 0;

        // Suma los números pares dentro del rango
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
            
        }
        
        // Imprime el resultado
        System.out.println("La suma de los numeros pares en el rango de " + start + " a " + end + " es: " + sum);
        
    }
    
}
