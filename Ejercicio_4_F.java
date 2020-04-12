package Funciones;

import java.util.Scanner;

public class Ejercicio_4_F {
	static void doble(int num)
	 {
		int doble;
		 doble=2*num; // calculamos el doble de num
		 System.out.println("El doble es: " +doble);
	 }
	public static void main(String[] args) {
		// TFunción que muestra en pantalla el doble del valor que se le pasa como parámetro.
		Scanner teclado=new Scanner(System.in);
		

			 int num;
			 System.out.print("Introduzca un número: ");
			 num=teclado.nextInt();
			 doble(num);
		
		
		teclado.close();
	}

}
