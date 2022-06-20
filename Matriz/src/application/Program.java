package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int w=0;
		
		
		System.out.println("Digite quantas linhas e colunas você deseja que tenha a matriz");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.println("Digite o valor correspondente a linha:" + (i+1) + " e coluna:" + (j+1));
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(i==j){
					System.out.println(mat[i][j]);
				}
			}
		}
		
		System.out.println("Numeros negativos: ");
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if(mat[i][j]<0){
					w += 1;
					System.out.println(mat[i][j]);
				}
			}
		}
		System.out.println("Total de numeros negativos: " + w);
		
		sc.close();
		
	}

}
