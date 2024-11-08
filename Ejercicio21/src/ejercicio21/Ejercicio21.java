
package ejercicio21;

import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el número del mes (1-12): ");
        int mes = sc.nextInt();
        
        int dias;
        
        switch (mes) {
            case 1,3,5,7,8,10,12:
                dias = 31;
                break;
            case 4,6,9,11:
                dias = 30;
                break;
            case 2: 
                System.out.println("Introduce el año:");
                int anio = sc.nextInt();
                
                if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                    dias = 29; 
                } else {
                    dias = 28;  
                }
                break;
            default:
                System.out.println("Mes inválido. Debe ser un número entre 1 y 12.");
                dias = -1;  
        }
        
        if (dias != -1) {
            System.out.println("El mes " + mes + " tiene " + dias + " días.");
        }
    }
}
