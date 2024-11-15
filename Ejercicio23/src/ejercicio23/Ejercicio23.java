
package ejercicio23;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int numero;
        final int MIN = 10;
        final int MAX = 20;

        do {
            System.out.print("Introduce un número entero (entre " + MIN + " y " + MAX + "): ");
            numero = sc.nextInt();
            
            if (numero < MIN || numero > MAX) {
                System.out.println("El número no está dentro del rango permitido.");
            } else {
                if (numero % 2 == 0) {
                    System.out.println("El número " + numero + " es par.");
                } else {
                    System.out.println("El número " + numero + " es impar.");
                }
                System.out.println("El número está dentro del rango.");
            }
        } while (numero < MIN || numero > MAX);
    }
}
