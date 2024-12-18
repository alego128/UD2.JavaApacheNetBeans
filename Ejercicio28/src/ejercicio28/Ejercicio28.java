
package ejercicio28;

import java.util.Scanner;

public class Ejercicio28 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce un número para calcular su factorial: ");
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("El factorial no está definido para números negativos.");
        } else {
            long factorial = 1; 
            
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}
