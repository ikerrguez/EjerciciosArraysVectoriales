package ejercicio1;

import java.util.Scanner;

public class Principal {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuántos nombres quieres guardar?");
        int numeroNombres = sc.nextInt();
        String[] cantidad = new String[numeroNombres];
        String nombre;
        int numNombres=1;
        System.out.println("Introduce los nombres que quieres guardar");

        for (int i = 0; i < cantidad.length; i++) {
            System.out.println("Nombre "+numNombres);
            nombre = sc.next();
            cantidad[i] = nombre;
            numNombres++;
        }
        for (int i=cantidad.length- 1; i >= 0; i--) {
            System.out.println("Posición "+ i + cantidad[i]);
        }
    }
}
