package Funciones;

import java.util.Scanner;

public class Ejercicio_2_F {
	static int maximo(int a, int b){ // suponemos que los tres números serán distintos
		 int max;

		 if(a>b)
		 max=a;
		 else
		 max=b;
		 return(max);
		 }
	public static void main(String[] args) {
		// Diseñar una función que tenga como parámetros dos números, y que calcule el máximo. 
	
		Scanner teclado=new Scanner(System.in);
			
			 int max;
			 int a,b;
			 System.out.print("Introduzca un numero: ");
			 a=teclado.nextInt();
			 System.out.print("Introduzca otro numero: ");
			 b=teclado.nextInt();

			 max =maximo (a, b);
			 System.out.println("El número mayor es: " +max);
			teclado.close();
	}

}
