package Bucles;

import java.util.Scanner;

public class Ejercicio_15 {

	public static void main(String[] args) {
		//  Leer los datos correspondiente a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera de la
		// forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
//NO FUNCIONA
		Scanner teclado= new Scanner (System.in);
int A[]=new int [12];
int B[]=new int [12];
int C[]=new int [24];
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
while(i<12) {
	for(int k=0;k<3;k++) {
		C[j]=A[i+k];
		j++;
	}
		for(int k=0;k<3;k++) {
			C[j]=B[i+k];
			j++;
		}
		
		
i+=3;
	
}


System.out.println("La tabla queda: ");
for( j=0;j<24;j++) {
	System.out.println(" " +C[j]);
}
teclado.close();
	}

}
