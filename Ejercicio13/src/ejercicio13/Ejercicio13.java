package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        

        boolean resultado1 = (10 + 5 * 2 > 20 && 4 == 4);
        System.out.println("Resultado de la operación (10 + 5 * 2 > 20 && 4 == 4): " + resultado1);

        boolean resultado2 = (!(7 + 3 > 10) || 3 * 2 <= 6);
        System.out.println("Resultado de la operación (!(7 + 3 > 10) || 3 * 2 <= 6): " + resultado2);

        boolean resultado3 = (10 / 2 + 3 * 5 == 19 && true);
        System.out.println("Resultado de la operación (10 / 2 + 3 * 5 == 19 && true): " + resultado3);

        int x = 5;
        x += 3 * 2;  
        System.out.println("Resultado de la operación (int x = 5; x += 3 * 2): " + x);

        boolean b = false;
        b = !b || 7 % 2 == 1;
        System.out.println("Resultado de la operación (boolean b = false; b = !b || 7 % 2 == 1): " + b);
    }
}
