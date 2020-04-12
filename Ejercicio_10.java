package Bucles;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en el mismo orden introducido.
		Scanner teclado=new Scanner (System.in);
		int Array[]= new int [5];
		System.out.println("Introduzca el elemento del Array.");
		
		for(int i=0;i<Array.length;i++) {
			
			System.out.println("Elemento: " +i +": ");
			Array[i]=teclado.nextInt();
			
		}
		for(int i=0;i<Array.length;i++) {
			System.out.print("[ " +Array[i]+" ]");
		}
			
		
teclado.close();
	}

}
