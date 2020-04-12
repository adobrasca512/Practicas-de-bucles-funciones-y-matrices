package Bucles;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		// Mostrar las tablas de multiplicar del 1 al 10
		//int Tabla=0;
		Scanner teclado = new Scanner (System.in);
		int valor=0;
		int j=0;



		/*System.out.print("Introduzca el tamaño de la tabla: ");
		Tabla = teclado.nextInt();*/
		System.out.print("Introduzca hasta que tabla desea multiplicar: ");
		valor= teclado.nextInt();

		for(int i=1;i<=valor;i++) {
			// 5
			// 0 1 2 3 4 5

			for( j=1;j<=valor;j++) {

				int resultado =j*i;

				System.out.println("[ "+j +"x" +i +" = " +resultado +" ]");
			}
			System.out.println();
		}
		teclado.close();
	}

}
