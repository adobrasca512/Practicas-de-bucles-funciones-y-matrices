package Bucles;

import java.util.Scanner;

public class Ejercicio_11 {

	public static void main(String[] args) {
		// Leer 5 números y mostrarlos en orden inverso al introducido.
Scanner teclado= new Scanner (System.in);
int Array[]=new int [5];
System.out.println("Introduzca los valores que desea en el Array: ");
for(int i=0;i<Array.length;i++) {
	System.out.println("Introduzca el elemento " +i +": ");
	Array[i]=teclado.nextInt();
}
for(int i=4;i>=0;i--) {
	
	System.out.println("[ " +Array[i] +" ]");
}
teclado.close();
	}

}
