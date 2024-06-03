
package actividadn3;

import java.util.Scanner;

/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio1 {

    /**
     * 1. Hacer un programa en Java que sume los siguientes 25 impares que
     * le siguen alnúmero n (n es determinado por el usuario). Imprimir los 
     * 25 impares y la suma.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n = scanner.nextInt();

        // 1.Contador para llevar la cuenta de los impares encontrados y la suma acumulada
        int contadorImpares = 0;
        int sumaImpares = 0;

        // 2. Comenzamos a buscar los impares después de n
        int numeroActual = n + 1;

        System.out.println("Los siguientes 25 impares a " + n + " son:");
        // 3. Iteramos hasta que encontremos los 25 impares siguientes
        while (contadorImpares < 25) {
            if (numeroActual % 2 != 0) { 
                System.out.println(numeroActual);
                sumaImpares += numeroActual;
                contadorImpares++;
            }
            numeroActual++;
        }
        System.out.println("La suma de los 25 impares siguientes a " + n + " es: " + sumaImpares);
    }
    
}
