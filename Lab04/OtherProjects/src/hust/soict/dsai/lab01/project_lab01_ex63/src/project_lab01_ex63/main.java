package hust.soict.dsai.lab01.project_lab01_ex63.src.project_lab01_ex63;

import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height of triangle: ");
		int n = sc.nextInt();
		System.out.println(n);
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i; j ++) {
				System.out.print(" ");
			}
			for (int j =0; j < 2*i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
