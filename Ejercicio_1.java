package Bucles;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// Crea una aplicación que dibuje una escalera de asteriscos. Nosotros le pasamos la altura de la escalera por teclado. 
		Scanner teclado= new Scanner (System.in);

		System.out.println("Ingrese la altura que desee");
		int Altura=0;
		Altura=teclado.nextInt();// i es igual al numero de asteriscos
		// el numero de asteriscos debe ser menor o igual que la altura
		for(int i=1;i<=Altura;i++) {
			// la otra fila debe ser menor al numero de asteriscos, es decir que si Altura es 5 la fila debe ser 4
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		teclado.close();
	}

}
