
package actividadn3;
import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio8 {

    /**
     * 8. Dado N cantidad de precios de gaseosas en un supermercado el gerente 
     * de ventas desea que se genere un programa que le permita saber cuál 
     * de las gaseosas tieneel mayor precio, cuál tiene menor precio y cuál 
     * es el precio promedio. Hacer lasimpresiones según lo requerido
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Solicita al usuario que ingrese la cantidad de precios
        System.out.print("Ingrese la cantidad de precios de gaseosas: ");
        int n = scanner.nextInt();
        
        // 2. Verifica que n sea mayor que 0
        if (n <= 0) {
            System.out.println("La cantidad de precios debe ser mayor que 0.");
            return;
        }

        double[] prices = new double[n];
        double total = 0.0;

        // 3. Solicita al usuario que ingrese cada precio y lo almacena en el array
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el precio de la gaseosa " + (i + 1) + ": ");
            prices[i] = scanner.nextDouble();
            total += prices[i];
        }

        // 4. Inicializa el mayor y menor precio
        double maxPrice = prices[0];
        double minPrice = prices[0];

        // 5. Encuentra el mayor y menor precio
        for (int i = 1; i < n; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
            }
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
        }

        // Calcula el precio promedio
        double averagePrice = total / n;

        // Imprime los resultados
        System.out.println("El mayor precio es: " + maxPrice);
        System.out.println("El menor precio es: " + minPrice);
        System.out.println("El precio promedio es: " + averagePrice);
    }
    
}
