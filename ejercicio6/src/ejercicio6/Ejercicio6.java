
package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia (puede contener decimales): ");
        double radio = scanner.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }
}

