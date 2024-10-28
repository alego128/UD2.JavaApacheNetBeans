package ejercicio6;

import java.util.Scanner;

public class otraVersion {

    public static void main(String[] args) {
        
        final double PI = 3.14;
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia (puede contener decimales): ");
        double radio = scanner.nextDouble();

        double longitud = 2 * PI * radio;
        double area =PI * PI;

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El area de la circunferencia es: " + area);
    }
}