
package actividadn3;
import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio7 {

    /**
     * 7. Realizar un programa en Java que dado n cantidad de números determine 
     * si esprimo o no y si ese número primo es múltiplo de 3, se debe contar. 
     * Imprimircantidad de primos y cantidad de múltiplos de 3
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de numeros: ");
        int n = scanner.nextInt();

        int primeCount = 0;
        int primeMultipleOf3Count = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            int num = scanner.nextInt();

            if (isPrime(num)) {
                primeCount++;
                if (num % 3 == 0) {
                    primeMultipleOf3Count++;
                }
            }
        }

        System.out.println("Cantidad de numeros primos: " + primeCount);
        System.out.println("Cantidad de numeros primos que son multiplos de 3: " + primeMultipleOf3Count);
    }

    // Método para determinar si un número es primo
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
