package Bucles;

import java.util.Scanner;

public class Ejercicio_19 {

	public static void main(String[] args) {
		//  Leer 10 enteros. Guardar en otra tabla los elementos pares de la primera, y a continuación los elementos
		//impares.
		Scanner teclado= new Scanner(System.in);
		int t[];
		 int cont_par, par[]; // contador de números pares y tabla para guardarlos
		 int cont_impar,impar[]; // ídem para los impares
		 t = new int[10];
		 // Leemos los valores de la tabla
		 for (int i=0;i<10;i++){
		 System.out.print("Introduzca un número: ");
		 t[i]=teclado.nextInt();
		 }
		 // contamos la cantidad de elementos pares e impares
		 // también se podía contar solo lo pares y calcular los impares=10 -pares
		 cont_par=0;
		 cont_impar=0;
		 for (int i=0;i<10;i++)
		 if(t[i]%2==0)
		 cont_par++;
		 else
		 cont_impar++;
		 // creamos las tablas par e impar del tamaño adecuado
		 par=new int[cont_par];
		 impar=new int[cont_impar];
		 // volvemos a procesar para copiar cada elemento en la tabla adecuada
		 cont_par=0;
		 cont_impar=0;
		 for (int i=0;i<10;i++)
			 if(t[i]%2==0)
			 {
			 par[cont_par]=t[i];
			 cont_par++;
			 }
			 else
			 {
			 impar[cont_impar]=t[i];
			 cont_impar++;
			 }

			 System.out.println("\n\nTabla par:");
			 for (int i=0;i<cont_par;i++)
			 System.out.println(par[i]);

			 System.out.println("Tabla impar:");
			 for (int i=0;i<cont_impar;i++)
			 System.out.println(impar[i]);
			 teclado.close();
	}

}
