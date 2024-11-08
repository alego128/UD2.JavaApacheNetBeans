
package ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("Introduce un número (0 para salir): ");
            numero = sc.nextInt();

            if (numero == 0) {
                System.out.println("Has salido del programa.");
                break;
            }

            if (numero % 2 == 0) {
                System.out.println("El número " + numero + " es par.");
            } else {
                System.out.println("El número " + numero + " es impar.");
            }

            if (numero > 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else {
                System.out.println("El número " + numero + " es negativo.");
            }

            int cuadrado = numero * numero;
            System.out.println("El cuadrado de " + numero + " es " + cuadrado);


        } while (numero != 0);

    }
}
