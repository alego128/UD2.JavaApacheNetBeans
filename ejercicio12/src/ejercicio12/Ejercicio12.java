
package ejercicio12;


import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double numero = scanner.nextDouble();

        double valorAbsoluto = (numero <  0)? -numero : numero;

        System.out.println("El valor absoluto del número es: " + valorAbsoluto);
    }
} 
