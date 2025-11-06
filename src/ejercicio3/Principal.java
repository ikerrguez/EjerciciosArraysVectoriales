package ejercicio3;

import java.util.Scanner;

public class Principal {
    static void main() {
        System.out.println("Introduce la película qure quieres ver");
        String[] catalogo = {"Padrino", "Matrix", "Up", "Avatar", "PulpFiction", "Airbag", "4Rooms", "MadMax"};
        Scanner sc = new Scanner(System.in);
        String titulo = sc.nextLine();
        int i = 0;
        boolean noDetectada = true;

        while (noDetectada) {
            if (titulo.equalsIgnoreCase(catalogo[i])) {
                System.out.println("Si!" + titulo + " está en el catálogo");
                noDetectada = false;
            }
            i++;
            if ((i == catalogo.length) && (noDetectada==true)){
                System.out.println("La película " + titulo + " no está en el catálogo");
                noDetectada = false;
            }
        }
    }
}