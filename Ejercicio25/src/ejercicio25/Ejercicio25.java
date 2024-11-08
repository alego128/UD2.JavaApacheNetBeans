package ejercicio25;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio25 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int aciertos = 0;

        do {
            int num1 = random.nextInt(100) + 1;
            int num2 = random.nextInt(100) + 1;

            System.out.println("Cuánto es " + num1 + " + " + num2 + "?");
            int respuestaUsuario = sc.nextInt();

            if (respuestaUsuario == num1 + num2) {
                System.out.println("Correcto");
                aciertos++;
            } else {
                System.out.println("Incorrecto. La respuesta correcta era " + (num1 + num2));
                break; 
            }
        } while (true);  
        
        System.out.println("Has acertado " + aciertos + " veces.");
    }
}

