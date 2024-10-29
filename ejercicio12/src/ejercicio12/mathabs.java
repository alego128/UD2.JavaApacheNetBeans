
package ejercicio12;

import java.util.Scanner;

public class mathabs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        double valorAbsoluto = Math.abs(numero);

        System.out.println("El valor absoluto del número es: " + valorAbsoluto);
    }
}