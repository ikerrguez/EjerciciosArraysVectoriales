package ejercicio2;

import java.util.Scanner;

public class Principal {
    static void main() {
        int[] puntuaciones1 = new int[5];
        int[] puntuaciones = {500, 1080, 2046, 128, 5};
        int mayor = 0;
        int menor = puntuaciones[0];

        for (int i = 0; i < puntuaciones.length; i++) {
            if (mayor < puntuaciones[i]) {
                mayor = puntuaciones[i];
            }
            if (menor > puntuaciones[i]) {
                menor = puntuaciones[i];
            }
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        }
    }
}


