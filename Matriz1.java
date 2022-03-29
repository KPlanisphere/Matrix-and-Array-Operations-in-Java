//----------->Matriz1

import java.util.Scanner;

class Matriz1{
	public static void main(String[] args){
		double A[][],B[][],C[][];
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Programa que suma y multiplica dos matrices cuadradas nxn");
		System.out.print("Deme el valor de n: ");
		n = sc.nextInt();
		A = new double [n][n];
		B = new double [n][n];
		C = new double [n][n];
		
		//ENTRADA DATOS MATRIZ A
		System.out.println("\nIngresa los datos de la matriz A: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.printf("A[%d][%d]: ",(i+1),(j+1));
				A[i][j] = sc.nextDouble();
				
			}
			System.out.println();
			
		}
		//ENTRADA DATOS MATRIZ B
		System.out.println("\nIngresa los datos de la matriz B: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.printf("B[%d][%d]: ",(i+1),(j+1));
				B[i][j] = sc.nextDouble();
			}
			System.out.println();
		}
		
		
		//SUMA DE MATRICES
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				C[i][j] = A[i][j] + B[i][j];
			}
		}
		//IMPRECION SUMA DE MATRICES
		System.out.println("La suma de matrices es: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}


		//PRODUCTO DE MATRICES
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				C[i][j] = 0;
				for(int k=0;k<n;k++){
					C[i][j] = C[i][j]+A[i][k]*B[k][j];//ALGORITMO MULTI MATRICES
				}
			}
		}
		//IMPRECION SUMA DE MATRICES
		System.out.println("El producto de matrices es: ");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(C[i][j] + "\t");
			}
			System.out.println();
		}
		
	}//FIN MAIN
	
}//FIN DE LA CLASE
