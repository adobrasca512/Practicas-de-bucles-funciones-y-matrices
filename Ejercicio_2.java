package Bucles;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		// Crea una aplicación que dibuje una escalera inversa de asteriscos.
		//Nosotros le pasamos la altura de la escalera inversa por teclado
        Scanner teclado = new Scanner (System.in);
		int Altura=0;
		//La altura debe ser mayor que los asteriscos
		System.out.println("Introduzca la altura que desea");
		Altura = teclado.nextInt();
		//los asteriscos deben ser igual a la altura, los asteriscos deben ser mayor a 0
		for(int i=Altura;i>0;i--) {
			//En las filas de abajo deben ser igual a numero de asteriscos pero mayores que o
			for(int j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
teclado.close();
	}

}
