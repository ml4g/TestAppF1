public class Figuras {

    public static void main(String[] args) {
        int lineas = 5;
        int ancho = 7;  // Usado para el rectángulo

        // Imprimir un rectángulo
        System.out.println("Rectángulo");
        System.out.println("----------\n");

        for (int i = 0; i < lineas; i++) {
            for (int j = 0; j < ancho; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Imprimir un triángulo invertido
        System.out.println("\n\nTriángulo Invertido");
        System.out.println("-------------------\n");

        for (int i = lineas; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Imprimir una pirámide
        System.out.println("\n\nPirámide");
        System.out.println("--------\n");

        for (int i = 1; i <= lineas; i++) {
            for (int j = lineas; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        // Imprimir una cruz
        System.out.println("\n\nCruz");
        System.out.println("----\n");

        int tamano = lineas;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if (i == tamano / 2 || j == tamano / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
