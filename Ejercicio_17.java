package Bucles;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		// Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. Éstos los guardaremos en una
		//tabla de tamaño 10. Leer un número N, e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
		
		Scanner teclado= new Scanner(System.in);
		int Array[]=new int [10];
		int N=0;
		boolean creciente=true;
		System.out.println("Introduzca la tabla: ");
for (int i=0;i<5;i++) {
	System.out.println("Introduzca elemento " +i +": ");
	Array[i]=teclado.nextInt();
}
for(int i=0;i<4;i++) {
	if(Array[i]<Array[i+1]) {
		creciente=true;
	}
}
if(creciente) {
	System.out.println("Introduzca un Valor (N): ");
	
	if(teclado.hasNextInt()) {
		N=teclado.nextInt();
		// 1 2 3 4 5 6
		// 7
		int j=0;
		int sitio_num=0;
		
		while (Array[j]<N && j<=4) {
			sitio_num ++;
			 j++;
		}
		for (int i=4; i>=sitio_num; i--) {
			Array[i+1]=Array[i];
		}
			
			 
			 Array[sitio_num]=N;
			 System.out.println("La nueva serie ordenada queda: ");
			 for (int i=0;i<5+1;i++) {
				 System.out.println(Array[i]);
			 }
			 
	}
	else {
		System.out.println("Valor no aceptado. ");
	}
}
if(creciente==false) {
	System.out.println("No esta ordenado de manera creciente.");
}
teclado.close();
	}

}
