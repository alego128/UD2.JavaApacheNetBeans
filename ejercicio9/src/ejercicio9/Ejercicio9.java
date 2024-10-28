
package ejercicio9;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        var per = new variables();
        Scanner sc = new Scanner(System.in);
        Scanner sct = new Scanner(System.in);
        
        System.out.println("Está lloviendo(true/false)?: ");
        per.setLlueve(sc.nextBoolean());
        
        System.out.println("Hemos hecho la tarea(true/false)?: ");
        per.setTareasTerminadas(sc.nextBoolean());

        System.out.println("Tienes que ir a la biblioteca(true/false)?: ");
        per.setIrBiblio(sc.nextBoolean());
        
        
        if (per.isLlueve() == true && per.isTareasTerminadas() == true  ||per.isIrBiblio() == true ) {
            System.out.println("Podemos salir a la calle");
        } else {
            System.out.println("No podemos salir a la calle");
        }
        
    }
}