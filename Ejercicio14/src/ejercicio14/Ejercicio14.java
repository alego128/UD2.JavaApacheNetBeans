
package ejercicio14;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer trimestre: ");
        int nota1 = sc.nextInt();
        
        System.out.print("Introduce la nota del segundo trimestre: ");
        int nota2 = sc.nextInt();
        
        System.out.print("Introduce la nota del tercer trimestre: ");
        int nota3 = sc.nextInt();


        double mediaDecimal = (nota1 + nota2 + nota3) / 3;

        int mediaEntera = (int) mediaDecimal;

        System.out.println("Nota media en el boletín (parte entera): " + mediaEntera);
        System.out.println("Nota media en el boletín (con decimales): " + mediaDecimal);

    }
}

