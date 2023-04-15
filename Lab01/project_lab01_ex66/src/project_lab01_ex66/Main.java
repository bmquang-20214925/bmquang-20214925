package project_lab01_ex66;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter the size of 2 matrix:");
		System.out.print("Number of rows: ");
		int row = sc.nextInt();
		System.out.print("Number of cols");
		int col = sc.nextInt();
		System.out.println("Please enter elements of the 1st matrix");
		
		double[][] mat_1 = new double[row][col];
		for (int i = 0; i < row; i ++) {
			for (int j =0; j < col; j ++) {
				System.out.print(String.format("mat_1[%d][%d] = ",i,j));
				mat_1[i][j] = sc.nextDouble();
			}
		}
		System.out.println("Please enter elements of the 2nd matrix");
		
		double[][] mat_2 = new double[row][col];
		for (int i = 0; i < row; i ++) {
			for (int j =0; j < col; j ++) {
				System.out.print(String.format("mat_2[%d][%d] = ",i,j));
				mat_2[i][j] = sc.nextDouble();
			}
		}
		double [][] res_mat = new double[row][col];
		for (int i = 0; i < row; i ++) {
			for (int j =0; j < col; j ++) {
				res_mat[i][j] = mat_1[i][j] + mat_2[i][j];
			}
		}
		System.out.println("Result matrix of addition:");
		for (int i = 0; i < row; i ++) {
			for (int j =0; j < col; j ++) {
				System.out.print(res_mat[i][j] + " ");
			}
			System.out.println();
		}
}

}


