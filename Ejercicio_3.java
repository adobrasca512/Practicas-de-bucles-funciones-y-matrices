package Bucles;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		//Crea una aplicación que dibuje una escalera de números, siendo cada linea un numero. 
		//Nosotros le pasamos la altura por teclado.
	Scanner teclado = new Scanner (System.in);
		System.out.print("Introduzca la altura que desea: ");
		int Altura=0;
		Altura= teclado.nextInt();
		for(int i=1;i<=Altura;i++) {
			
			for(int j=0;j<i;j++) {
				
				System.out.print(i);
			}
			System.out.println();
		}
		
		teclado.close();
		
	}
}
