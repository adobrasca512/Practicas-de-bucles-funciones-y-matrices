package Bucles;

import java.util.Scanner;

public class Ejercicio_14 {

	public static void main(String[] args) {
		//  Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: el 1º de A, el 1º
		//de B, el 2º de A, el 2º de B, etc.
		Scanner teclado= new Scanner(System.in);
		int A[]=new int [10];
		int B[]=new int [10];
		int C[]=new int [20];
		int i=0;
		System.out.println("Introduzca los elementos de la tabla A: ");
		for( i=0;i<A.length;i++) {
			A[i]=teclado.nextInt();
		}
		System.out.println("Introduzca los elementos de la tabla B: ");
		for( i=0;i<B.length;i++) {
			B[i]=teclado.nextInt();
		}
		int j=0;
		for( i=0;i<10;i++) {
			C[j]=A[i];
			j++;
			C[j]=B[i];
			j++;


		}
		System.out.println("La tabla queda: ");
		for( j=0;j<C.length;j++) {
			System.out.println(" " +C[j]);
		}
		teclado.close();
	}

}
