
package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Que edad tienes?: ");
         int edad  = sc.nextInt();

        boolean esMayorDeEdad = edad >= 18;

        System.out.println("¿Es mayor de edad? " + esMayorDeEdad);
    }
}
