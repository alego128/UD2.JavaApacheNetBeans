
package ejercicio4;

public class Ejercicio4 {

    public static void main(String[] args) {

        short valorMaximo = 32767;
        short valorMinimo = -32768;

        valorMaximo = (short) (valorMaximo +1);
        valorMinimo = (short) (valorMinimo -1);
        
        
        System.out.println("El valor máximo es: "+valorMaximo);
        System.out.println("El valor mínimo es: "+valorMinimo);
        }
    }
