package ejercicio4;
import java.util.Arrays;

public class Principal {
    static void main() {
        String[] equipoA = {"Messi", "Suárez", "Neymar"};
        String [] equipoB = {"Xavi", "Iniesta"};
        String[] equipoFusion = new String[equipoA.length + equipoB.length];

        System.arraycopy(equipoA, 0, equipoFusion, 0, equipoA.length);
        System.arraycopy(equipoB, 0, equipoFusion, equipoA.length, equipoB.length);

        System.out.println("Equipo A: " + Arrays.toString(equipoA));
        System.out.println("Equipo B: " + Arrays.toString(equipoB));
        System.out.println("Equipo Fusión: " + Arrays.toString(equipoFusion));
    }
}


