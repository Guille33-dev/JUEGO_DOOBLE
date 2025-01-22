package juegoDoblee;
import java.util.*;
public class JuegoDoble {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][] array= new int[4][4];
		int [] jugador1= new int[array.length * array.length / 2];
		int [] jugador2= new int[array.length * array.length / 2];
		//int a=sc.nextInt();
		
		System.out.println("Introduce un número del 1 al 8.");
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				System.out.println("Introduce el número para la posición ["+i+"] ["+j+"]");
				array[i][j]= sc.nextInt();
			}
		}
	}
}
