
package ejercicio16;

import java.util.Scanner;

public class Ejercicio16 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número entero: ");
        int num = sc.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("Este número es par");
        } else 
            System.out.println("Este número es impar");
        
    }   
}
