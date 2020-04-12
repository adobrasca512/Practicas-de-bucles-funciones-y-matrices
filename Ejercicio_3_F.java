package Funciones;

import java.util.Scanner;

public class Ejercicio_3_F {
	static void mostrar(int a,int b){
		 int mayor, menor;
		 // desconocemos el orden en el que vienen a y b.
		 // Lo que haremos es poner los valores correctos en mayor, menor.

		 if(a>b){ // a es el mayor. Se podría utilizar la función maximo() implementada anteriormente.
		 mayor=a;
		 menor=b;
		 }
		 else{ // en este caso b será el mayor
			 mayor=b;
			 menor=a;
			 }
			 for (int i=menor;i<=mayor;i++)
			 System.out.print(i+" ");
			 System.out.println();
			 }
		 
	public static void main(String[] args) {
		// Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos,
		//inclusive.
		int a,b;
		Scanner teclado=new Scanner(System.in);
		 System.out.print("Introduzca primer numero: ");
		 a=teclado.nextInt();
		 System.out.print("Introduzca segundo numero: ");
		 b=teclado.nextInt();

		 mostrar(a,b);
		 teclado.close();
	}

}
