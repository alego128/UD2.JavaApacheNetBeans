
package ejercicio32;

import java.util.Scanner;

public class Ejercicio32 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();

        int resultado = maximo(num1, num2);

        System.out.println("El valor máximo entre " + num1 + " y " + num2 + " es: " + resultado);

    }
    
    public static int maximo(int a, int b) {
        if (a > b) {
            return a; 
        } else 
            return b; 
    }
}
