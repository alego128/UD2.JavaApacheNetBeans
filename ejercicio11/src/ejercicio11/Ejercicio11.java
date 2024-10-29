
package ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        int mayor = (numero1 > numero2) ? numero1 : numero2;

        System.out.println("El mayor de los dos números es: " + mayor);
    }
}
