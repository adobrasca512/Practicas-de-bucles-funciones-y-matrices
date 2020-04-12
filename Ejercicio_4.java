package Bucles;

import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		// Crea una aplicación que dibuje una escalera de números, 
		//siendo cada linea números empezando en uno y acabando en el numero de la linea.
Scanner teclado=new Scanner (System.in);
		int Altura=0;
		System.out.print("Introduzca la altura que desee: ");
        Altura= teclado.nextInt();
        for (int i=1;i<=Altura;i++){
            //Este bucle muestra los numeros en cada fila
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            //Saltamos de linea
            System.out.println("");
        }
       
      
teclado.close();
	}

}
