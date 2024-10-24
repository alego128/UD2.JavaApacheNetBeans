
package ejercicio2;

import java.util.Scanner;

public class pedirEdad {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in) ;
        
        System.out.println("Cual es tu edad:");
        int edad = sc.nextInt();
        
        System.out.println("Tu edad el año que viene será: " +(edad + 1));       
        
    }
}

