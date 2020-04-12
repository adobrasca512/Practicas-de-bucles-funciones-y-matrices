package Bucles;

import java.util.Scanner;

public class Ejercicio_16 {

	public static void main(String[] args) {
		// Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si los números están
		//ordenados de forma creciente, decreciente, o si están desordenados.
Scanner teclado= new Scanner(System.in);
		int Array[]=new int [10];
		System.out.println("Introduzca los valores que desee: ");
		int i=0;
for( i=0;i<Array.length;i++) {
	System.out.println("Elemento " +i +": ");
	Array[i]=teclado.nextInt();
	
}

boolean Creciente=false;

boolean Decreciente=false;
for( i=0; i<9;i++) {
	if(Array[i]>Array[i+1]) {// usamos i e i+1, por lo que la i solo podrá llegar hasta 8 (ó <9)
		 
		 Decreciente=true;
		
	}
	if(Array[i]<Array[i+1]) {
		Creciente=true;
		
		
	}
	
		
		
		
	
}
if(Creciente && Decreciente==false) {
	
	System.out.println("Estan crecientes ");
}
if(Creciente==false && Decreciente==true) {
	System.out.println("Estan decrecientes ");
}
if(Creciente==false && Decreciente==false)  {
	System.out.println("Son iguales ");
}
if(Creciente==true && Decreciente==true) {
	
	System.out.println("Estan desordenados ");
}
teclado.close();
	}

}
