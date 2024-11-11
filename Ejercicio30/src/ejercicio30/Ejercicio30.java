/*
package ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de filas para el triángulo: ");
        int n = sc.nextInt();

        
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); 
        }
    }
} 
*/

package ejercicio30;

import java.util.Scanner;

public class Ejercicio30 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el número de filas para el triángulo: ");
        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println(); 
        }
    }
}
