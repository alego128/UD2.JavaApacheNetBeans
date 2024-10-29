
package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PKM = 2.35;
        final double PKP = 1.95;

        double venManSem1, venManSem2, venPerSem1, venPerSem2;


        System.out.print("Introduce las ventas de manzanas (en kilos) del primer semestre: ");
        venManSem1 = sc.nextDouble();

        System.out.print("Introduce las ventas de manzanas (en kilos) del segundo semestre: ");
        venManSem2 = sc.nextDouble();

        System.out.print("Introduce las ventas de peras (en kilos) del primer semestre: ");
        venPerSem1 = sc.nextDouble();

        System.out.print("Introduce las ventas de peras (en kilos) del segundo semestre: ");
        venPerSem2 = sc.nextDouble();

        double beneficioManzanas = (venManSem1 + venManSem2) * PKM;
        double beneficioTotal = beneficioManzanas;
        double beneficioPeras = (venPerSem1 + venPerSem2) * PKP;
        beneficioTotal += beneficioPeras;

        System.out.println("Beneficio total por ventas de manzanas: " + beneficioManzanas + " €");
        System.out.println("Beneficio total por ventas de peras: " + beneficioPeras + " €");
        System.out.println("Beneficio total anual: " + beneficioTotal + " €");
    }
}
