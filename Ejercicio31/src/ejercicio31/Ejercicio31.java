
package ejercicio31;

import java.util.Scanner;


public class Ejercicio31 {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        variosSaludos(n);
    }   
    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Holaa");
        }
    }
}
