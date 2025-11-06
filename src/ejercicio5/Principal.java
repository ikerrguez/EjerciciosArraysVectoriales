package ejercicio5;

public class Principal {
    static void main() {
        int [] cocheFerrari = {340,3,95};
        int [] cochePorsche= {300,3,10};
        int victoriasFerrari=0;
        int victoriasPorsche=0;

        System.out.println("Comparativa coches");

        for (int i=0; i<cocheFerrari.length; i++){
            switch (i){
                case 0:
                    if (cocheFerrari[i]>cochePorsche[i]) {
                        System.out.println("Velocidad gana Ferrari" + "(" +cocheFerrari[i]+","+cochePorsche[i]+")");
                        victoriasFerrari++;
                    }else if (cochePorsche[i]>cocheFerrari[i]) {
                        System.out.println("Velocidad gana Porsche" + "(" + cochePorsche[i]+","+cocheFerrari[i]+")");
                        victoriasPorsche++;
                    }else{
                        System.out.println("Velocidad igual");
                    }
                    break;
                    case 1:
                        if (cocheFerrari[i]>cochePorsche[i]) {
                            System.out.println("Aceleración gana Ferrari" + "(" +cocheFerrari[i]+","+cochePorsche[i]+")");
                            victoriasFerrari++;
                        }else if (cochePorsche[i]>cocheFerrari[i]) {
                            System.out.println("Aceleración gana Porsche" + "(" + cochePorsche[i]+","+cocheFerrari[i]+")");
                            victoriasPorsche++;
                        }else{
                            System.out.println("Aceleración igual");
                        }
                        break;
                        case 2:
                            if (cocheFerrari[i]>cochePorsche[i]) {
                                System.out.println("Manejo gana Ferrari" + "(" +cocheFerrari[i]+","+cochePorsche[i]+")");
                                victoriasFerrari++;
                            }else if (cochePorsche[i]>cocheFerrari[i]) {
                                System.out.println("Manejo gana Porsche" + "(" + cochePorsche[i]+","+cocheFerrari[i]+")");
                                victoriasPorsche++;
                            }else{
                                System.out.println("Manejo igual");
                            }
            }
        }
        System.out.println("Resultado FINAL");
        System.out.println("Victorias por Ferrari: " + victoriasFerrari);
        System.out.println("Victorias por Porsche: " + victoriasPorsche);
        if (victoriasFerrari>victoriasPorsche){
            System.out.println("Victoria para Ferrari");
        }else if  (victoriasPorsche>victoriasFerrari){
            System.out.println("Victoria para Porsche");
        }else{
            System.out.println("Empate tecnico");
        }


    }
}
