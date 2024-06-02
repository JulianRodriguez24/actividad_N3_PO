
package actividadn3;
import java.util.Scanner;
/**
 *
 * @author Julian Rodriguez
 */
public class Ejercicio9 {

    /**
     * 9. Leer N cantidad de notas (validar rango de notas), imprimir el
     * promedio de lasnotas, la nota más alta y la más baja.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la Cantidad de notas : ");
        int n = scanner.nextInt();
        
        
        if (n <= 0) {
            System.out.println("La cantidad de notas debe ser mayor que 0.");
            return;
             
        }
        double[] Notas = new double[n];
        double total = 0.0;
        
        
        for (int i = 0; i < n; i++) {
            while (true) {
            System.out.print("Ingrese la Nota " + (i + 1) + ": ");
            Notas[i] = scanner.nextDouble();
            if (Notas[i] >= 0 && Notas[i] <= 5) {
                    break;
                } else {
                    System.out.println("La nota debe estar entre 0 y 5. Inténtelo de nuevo.");
                }
            }
            total += Notas[i];
        }   
        
        double maxNota = Notas[0];
        double minNota = Notas[0];
        
        for (int i = 1; i < n; i++) {
        
            if (Notas[i] > maxNota) {
                maxNota = Notas[i];
            }
            if (Notas[i] < minNota) {
                minNota = Notas[i];
            }
            
        }   
        
        double averageNotas = total / n;
        System.out.println("Informacion General");
        System.out.println("La Nota mayor es: " + maxNota);
        System.out.println("La Nota menor es: " + minNota);
        System.out.println("El promedio de Notas es: " + averageNotas);
    }    
    
}
