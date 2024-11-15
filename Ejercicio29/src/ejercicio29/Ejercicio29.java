package ejercicio29;

public class Ejercicio29 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i);

            for (int j =0 ; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            } 
        }
    }
}
