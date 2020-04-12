package Bucles;

import java.util.Scanner;

public class Ejrecicio_9 {

	public static void main(String[] args) {
		// Diseñar una aplicación que declare una tabla de 10 elementos enteros. Leer mediante el teclado 8 números.
		/*Después se debe pedir un número y una posición, insertarlo en la posición indicada, desplazando los que estén
		detrás*/
		Scanner teclado=new Scanner (System.in);
		int Array[]=new int [10];
		int elemento = 0;
		System.out.println("Inserte los valores que desea en el array: ");
		for(int i=0;i<=8;i++) {
			System.out.println("Array "+i +": "  );
			Array[i]=teclado.nextInt();
			
			
			
			
		}
		System.out.print("Introduzca la posicion que desea: ");
		int posicion = 0;
		posicion=teclado.nextInt();
		System.out.print("Introduzca el elemento que introducira: ");
		elemento=teclado.nextInt();
		for (int i=7;i>=posicion;i--) {
			Array[i+1]=Array[i];
			 
			//insertamos el nuevo elemento
			 Array[posicion] =elemento;
		}
			 
			 System.out.println("La tabla queda:");
			 for (int i=0;i<9;i++) {
				 System.out.println(Array[i]);
			 }
		teclado.close();	
       
	}

}
