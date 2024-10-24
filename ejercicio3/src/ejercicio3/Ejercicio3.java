
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa el año actual: ");
        int annoActual = scanner.nextInt();


        System.out.print("Ingresa tu año de nacimiento: ");
        int annoNacimiento = scanner.nextInt();


        int edad = annoActual - annoNacimiento;


        System.out.println("Tu edad es: " + edad );
    }
}
