package juegoDoblee;

public class JuegoDoblePrueba {
	import java.util.Scanner;

	public class JuegoParejas {
	    private int[][] matriz;
	    private int[] aciertosJugador1, aciertosJugador2;
	    private int tamaño;

	    // Constructor para inicializar la matriz y los arreglos
	    public JuegoParejas(int tamaño) {
	        this.tamaño = tamaño;
	        matriz = new int[tamaño][tamaño];
	        aciertosJugador1 = new int[tamaño * tamaño / 2];
	        aciertosJugador2 = new int[tamaño * tamaño / 2];
	    }

	    // Método para llenar la matriz con los números ingresados por el profesor
	    public void llenarMatriz() {
	        // ... Implementación para llenar la matriz
	    }

	    // Método para jugar un turno
	    public void jugarTurno(int[] aciertos) {
	        // ... Implementación para jugar un turno
	    }

	    // Método para verificar si dos números son pareja
	    public boolean esPareja(int num1, int num2) {
	        // ... Implementación para verificar si dos números son pareja
	    }

	    // Método para imprimir los resultados
	    public void imprimirResultados() {
	        // ... Implementación para imprimir los resultados
	    }

	    // Método principal para ejecutar el juego
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el tamaño de la matriz: ");
	        int tamaño = scanner.nextInt();
	        JuegoParejas juego = new JuegoParejas(tamaño);
	        juego.llenarMatriz();
	        // ... Lógica para jugar los turnos y mostrar los resultados
	    }
	}
}
