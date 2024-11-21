
package ejercicio33;

import java.util.Scanner;

public class Ejercicio33 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        int resultado = maximo(num1, num2, num3);

        System.out.println("El valor máximo entre " + num1 + " , " + num2 + "  y " + num3 + " es: " + resultado);

    }
    public static int maximo(int num1, int num2) {
        if (num1 > num2) {
            return num1; 
        } else 
            return num2; 
    }
    
    public static int maximo(int num1, int num2, int num3) {
        return maximo(maximo(num1, num2), num3);

    }
}
