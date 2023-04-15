package project_lab01_ex65;
import java.util.Scanner;
import java.util.Arrays;


public class Main {
	public static double sumOfArray(double[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i ++) {
			sum += arr[i];
		}
		return sum;
	
	}
	
	public static void sortArray(double[] arr) {
		double tmp;
		int n = arr.length;
		for (int i  = 0; i < n; i ++) {
			for (int j = 0; j < n - i -1; j ++) {
				if (arr[j] > arr[j+1]) {
					tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
	}
	
	public static double average(double[] arr) {
		return sumOfArray(arr)/ arr.length;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int n = sc.nextInt();
		System.out.println("Please enter each element of the array");
		double[] arr =  new double[n];

		for (int i = 0; i < n; i ++) {
			arr[i] = sc.nextDouble();
		}
		System.out.print("You've enter this array: ");
		System.out.println(Arrays.toString(arr));
		System.out.print("This is the array after being sorted:");
		sortArray(arr);
		System.out.println(Arrays.toString(arr));
		System.out.print("This is the sum of the array: ");
		System.out.println(sumOfArray(arr));
		System.out.print("This is the avg of the array: ");
		System.out.println(average(arr));
	}

}
