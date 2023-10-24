package ArraysProblems;

import java.util.Scanner;

public class MatrixMultiply {
	
	public static int[][] multiply(int A[][],int B[][]) {
		
		 int aRows = A.length;
		    int aColumns = A[0].length;
		    int bColumns = B[0].length;
		    int bRows=B.length;
		    
		    if (aColumns != bRows) {
		        System.out.println("Matrix multiplication is not possible. ");
		        return null; 
		    }
		
		int[][] resultMatrix=new int[aRows][bColumns];
		
		for(int i=0;i<aRows;i++) {
			
			for(int j=0;j<bColumns;j++) {
			
				for(int k=0;k<aColumns;k++) {
				
					resultMatrix[i][j] += A[i][k] * B[k][j];
				
				
				}	
			
		}
		}
		return resultMatrix;
	}
	
	public static void printMatrix(int result[][]){
		
		for(int i=0;i<result.length;i++) {
			for(int j=0;j<result[0].length;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the MatrixA rows:");
		
		int arows=in.nextInt();
		

		System.out.println("Enter the MatrixA coiumns :");
		
		int acolumns=in.nextInt();
		
		System.out.println("Enter the MatrixB rows:");
		int  brows=in.nextInt();

		System.out.println("Enter the MatrixB columns :");
		
		int bcolumns=in.nextInt();
		
		
		System.out.println("Enter the MatrixA values:");
		
		
		
		int[][] MatrixA=new int[arows][acolumns];
		
		for(int i=0;i<arows;i++) {
			for(int j=0;j<acolumns;j++) {
		  MatrixA[i][j]=in.nextInt();	
			}
	
		}
		
	System.out.println("Enter the MatrixB values:");
		
		int[][] MatrixB=new int[brows][bcolumns];
		
		for(int i=0;i<brows;i++) {
			for(int j=0;j<bcolumns;j++) {
		  MatrixB[i][j]=in.nextInt();	
		}
		}
		
    int resultMatrix[][]=multiply(MatrixA,MatrixB);
	System.out.println("\n Resultant Matrix:");
	printMatrix(resultMatrix);

	}

}
