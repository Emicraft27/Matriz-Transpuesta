import java.util.Scanner;

public class MatrizTranspuesta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir las dimensiones de la matriz
        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        // Crear la matriz original
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con los valores ingresados por el usuario
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Elemento en la posición (" + (i + 1) + "," + (j + 1) + "): ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Obtener la matriz transpuesta
        int[][] transpuesta = obtenerTranspuesta(matriz);

        // Imprimir la matriz original
        System.out.println("\nMatriz original:");
        imprimirMatriz(matriz);

        // Imprimir la matriz transpuesta
        System.out.println("\nMatriz transpuesta:");
        imprimirMatriz(transpuesta);

        scanner.close();
    }

    // Función para obtener la matriz transpuesta
    public static int[][] obtenerTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] transpuesta = new int[columnas][filas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                transpuesta[j][i] = matriz[i][j];
            }
        }

        return transpuesta;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}