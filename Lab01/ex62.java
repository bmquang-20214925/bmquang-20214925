package aproject;
import java.util.Scanner;


public class ex62 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name ?");
		String name = sc.nextLine();
		System.out.println("How old are you ?");
		int age = sc.nextInt();
		System.out.println("What is your height ?");
		double height = sc.nextDouble();
		
		System.out.println("Hello " + name + ". You are " + age + " years old" + ".Your height is " + height);
	}

}
