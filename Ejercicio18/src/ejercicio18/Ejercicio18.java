
package ejercicio18;

import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un número decimal: ");
        double num = sc.nextDouble();

        if (num > -1 && num < 1 && num != 0) {
            System.out.println("Este número es un número casi-cero.");
        } else 
            System.out.println("Este número no es un número casi-cero.");
        }
}

