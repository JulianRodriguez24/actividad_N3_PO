
package actividadn3;
import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio2 {

    /**
     * 2. Hacer un programa en Java que cuente y sume los múltiplos de 5 y 3 
     * (para sersumado debe verificarse que sea múltiplo de 5 y 3 a la vez) 
     * comprendidos entre 1y n (n es determinado por el usuario). Imprimir la 
     * cantidad de múltiplos de 5 y 3. 
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingrese el valor de n: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int count = 0;
        
        // 1.Itera los números desde 1 hasta n
        for (int i = 1; i <= n; i++) {
            // 2. Verifica si el número es múltiplo de 5 y de 3
            if (i % 5 == 0 && i % 3 == 0) {
                sum += i; 
                count++; 
            }
        }
        
        // 3. Imprimir los resultados
        System.out.println("Cantidad de multiplos de 5 y 3: " + count);
        System.out.println("Suma de los multiplos de 5 y 3: " + sum);
    }
    
}
