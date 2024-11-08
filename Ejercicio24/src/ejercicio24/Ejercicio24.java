
package ejercicio24;

import java.util.Scanner;

public class Ejercicio24 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un número: ");
        
        int a = sc.nextInt();
        
        int max = a;
        int min = a;
        
        while (a != -1) {
            if (max < a) {
                max = a;
            }
            if (min > a) {
                min = a;
            }
            System.out.println("Dime otro número: ");
            
        }
    }
}
