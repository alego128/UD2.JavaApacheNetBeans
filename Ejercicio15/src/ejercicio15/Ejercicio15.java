
package ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numeroDecimal = sc.nextDouble();
        
        int numeroRedondeado = (int) Math.round(numeroDecimal);
        
        System.out.println("El número redondeado al entero más próximo es: " + numeroRedondeado);
        
        

    }
}
