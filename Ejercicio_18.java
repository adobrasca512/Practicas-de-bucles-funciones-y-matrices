package Bucles;

import java.util.Scanner;

public class Ejercicio_18 {

	public static void main(String[] args) {
		//  Leer por teclado una tabla de 10 elementos numéricos enteros y una posición (entre 0 y 9). Eliminar el
		//elemento situado en la posición dada sin dejar huecos.
		Scanner teclado= new Scanner(System.in);
		int Array[]=new int [10];
		int posicion = 0;
		System.out.println("Introduzca la tabla: ");
		for (int i=0;i<10;i++) {
			System.out.println("Introduzca elemento " +i +": ");
			Array[i]=teclado.nextInt();
		}
		
		System.out.print("Introduzca la posicion que desea borrar: ");
		teclado.nextInt();
		for(int i=posicion;i<9;i++) {
			Array[i]=Array[i+1];
		}
		for(int i=0;i<9;i++) {
			System.out.println("La tabla queda: " +Array[i]);
		}
		
		
		teclado.close();
	}

}
