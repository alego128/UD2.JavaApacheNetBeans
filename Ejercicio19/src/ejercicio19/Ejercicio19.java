
package ejercicio19;

 import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        System.out.println("Introduce el tercer número: ");
        int num3 = sc.nextInt();
        
        if (num1 >= num2 && num1 >= num3) {
            if (num2 >= num3) {
                System.out.println("Orden: " + num1 + " - " + num2 + " - " + num3);
            } else 
                System.out.println("Orden: " + num1 + " - " + num3 + " - " + num2);
        } else if (num2 >= num1 && num2 >= num3) {
            if (num1 >= num3) {
                System.out.println("Orden: " + num2 + " - " + num1 + " - " + num3);
            } else 
                System.out.println("Orden: " + num2 + " - " + num3 + " - " + num1);
            }
         else if (num3 >= num1 && num3 >= num2) {
                if (num1 >= num2) {
                System.out.println("Orden: " + num3 + " - " + num1 + " - " + num2);
            } else 
                System.out.println("Orden: " + num3 + " - " + num2 + " - " + num1);
            }
        }
}