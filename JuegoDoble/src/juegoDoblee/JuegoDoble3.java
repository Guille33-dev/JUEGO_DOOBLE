package juegoDoblee;

import java.util.Scanner;

public class JuegoDoble3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[] conteoNum = new int[9]; // Para contar las repeticiones de los números (1 al 8)
        int[] puntuaciones = {0, 0}; // Puntos de jugador 1 y jugador 2
        
        // Rellenar la matriz con números del 1 al 8, no más de dos veces cada uno
        System.out.println("Introduce los números del 1 al 8 en la matriz. No repitas ningún número más de dos veces.");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                while (true) {
                    System.out.println("Introduce el número para la posición [" + i + "] [" + j + "]:");
                    int num = sc.nextInt();
                    if (num >= 1 && num <= 8 && conteoNum[num] < 2) {
                        matriz[i][j] = num;
                        conteoNum[num]++;
                        break;
                    } else {
                        System.out.println("Número inválido o ya repetido más de dos veces. Intenta de nuevo.");
                    }
                }
            }
        }

        // Juego
        System.out.println("\n¡Comienza el juego!");
        int turno = 0;
        while (!matrizLlenaDeCeros(matriz)) {
            System.out.println("\nTurno del Jugador " + (turno + 1));
            mostrarMatriz(matriz);

            int[] pos1 = leerPosi(sc, "Primera");
            int[] pos2 = leerPosi (sc, "Segunda");

            // Verificar si las posiciones forman una pareja válida
            if (matriz[pos1[0]][pos1[1]] == 
            	matriz[pos2[0]][pos2[1]] && 
            	matriz[pos1[0]][pos1[1]] != 0) {
                System.out.println("¡Acertaste! Número: " + matriz[pos1[0]][pos1[1]]);
                puntuaciones[turno]++;
                matriz[pos1[0]][pos1[1]] = 0; // Convertir a 0
                matriz[pos2[0]][pos2[1]] = 0; // Convertir a 0
            } else {
                System.out.println("No hay pareja.");
                System.out.println(matriz[pos1[0]][pos1[1]] + " | " + matriz[pos2[0]][pos2[1]]);
                turno = 1 - turno; // Cambiar turno
            }
        }

        // Resultado final
        System.out.println("\nJuego terminado.");
        System.out.println("Jugador 1: " + puntuaciones[0] + " puntos.");
        System.out.println("Jugador 2: " + puntuaciones[1] + " puntos.");
        System.out.println(puntuaciones[0] > puntuaciones[1] ? "¡Gana el Jugador 1!" : puntuaciones[0] < puntuaciones[1] ? "¡Gana el Jugador 2!" : "¡Empate!");

        sc.close();
    }

    // Mostrar matriz con asteriscos para números no descubiertos
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                System.out.print((num == 0 ? "0" : "*") + "\t");
            }
            System.out.println();
        }
    }

    // Leer posición del jugador
    public static int[] leerPosi(Scanner sc, String texto) {
        System.out.print(texto + " posición (fila y columna 0-3): \r\n");
        System.out.println();
        return new int[]{sc.nextInt(), sc.nextInt()};
    }

    // Verificar si la matriz está llena de ceros
    public static boolean matrizLlenaDeCeros(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int num : fila) {
                if (num != 0) return false;
            }
        }
        return true;
    }
}
