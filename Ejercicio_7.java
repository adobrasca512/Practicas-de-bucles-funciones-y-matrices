package Bucles;

public class Ejercicio_7 {

	public static void main(String[] args) {
		// Realizar un programa que investigue si el año 1999 fue año visiesto, si es divisible por 4 y por 10 y no es divisible por 400
		int año =1999;
		int divisible= año%4;
		int divisible1= año%10;
		int divisible2= año%400;
		boolean bisiesto=true;
		bisiesto=(divisible==0 && divisible1!=0 || divisible2==0) ;
			if(bisiesto) {
				System.out.println(" es bisiesto");
			}
			else {
				System.out.println("No lo es");
			}
		
	}

}
