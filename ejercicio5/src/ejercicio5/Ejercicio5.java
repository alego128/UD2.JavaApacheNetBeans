
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la primera nota (entera): ");
        int nota1 = scanner.nextInt();

        System.out.print("Ingresa la segunda nota (entera): ");
        int nota2 = scanner.nextInt();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("La media es: " + media);
    }
}
