//-----------> Arreglo1

import java.util.Scanner;

public class Arreglo1{
	
	public static void main(String[] args){
		double A[];
		int n;
		
		//ENTRADA POR TECLADO
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que ordena n n\u00fameros dados por el usuario");
		System.out.println("Dame el n\u00famero de valores a ingresar: ");
		
		//SE GUARDA EN OTRA VARIABLE PARA PODER IMPRIMIR (EN SC ESTA LA ENTRADA)
		n = sc.nextInt(); //next(INT,FLOAT,CHAR,DOUBLE,LINE)
		
		//DEFINIMOS EL TAMAÑO DEL ARREGLO
		A = new double[n];
		
		//LECTURA DE DATOS
		for(int i=0; i<n ;i++){
			System.out.print("Ingresa el dato " + (i+1) + ": ");
			A[i] = sc.nextDouble();
		}
		
		//ORDENACION DE DATOS (METODO DE LA BURBUJA)
		double ayuda;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				if(A[i]>A[j]){  //ORDEN DE MENOR A MAYOR
					ayuda = A[i];
					A[i] = A[j];
					A[j] = ayuda;					
				}
			}	
		}
		
		//IMPRESION DEL ARREGLO
		System.out.println("\nLos datos ordenados son: ");
		for(int i=0;i<n;i++){
			System.out.println(A[i]);
		}
	}
}
