
package ejercicio17;

import java.util.Scanner;

public class Ejercicio17 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entero: ");
        int num = sc.nextInt();
        System.out.println("Dime otro número entero: ");
        int num2 = sc.nextInt();
        
        if (num == num2) {
            System.out.println("Estos números son iguales");
        } else
            if (num2 > num) {
                System.out.println("El " +num2+ " es mayor que el " +num);
            } else
                if (num > num2) {
                System.out.println("El " +num+ " es mayor que el " +num2);
  
        }
    }
}