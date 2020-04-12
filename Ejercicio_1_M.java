package Matrices;



public class Ejercicio_1_M {

	public static void main(String[] args) {
		// Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición T[n,m]
		//debe contener n+m. Después se debe mostrar su contenido.
int Tabla [][]= new int [5][5];


for(int i=0;i<Tabla.length;i++) {
	
	for(int j=0;j<Tabla[0].length;j++) {
		Tabla[i][j]=i+j;
	}
}
for (int i=4;i>=0;i--)
{
System.out.println();
for (int j=0;j<5;j++)
{
System.out.print(Tabla[i][j]+" ");
}
}
	}

}
