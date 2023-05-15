package hust.soict.dsai.lab01;
import java.util.Scanner;
class ex226 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a11 = sc.nextDouble();
        double a12 = sc.nextDouble();
        double b1 = sc.nextDouble();
        double a21 = sc.nextDouble();
        double a22 = sc.nextDouble();
        double b2 = sc.nextDouble();
        double d = a11*a22 - a12*a21;
        double d1 = b1*a22 - a12*b2;
        double d2 = a11*b2 - a21*b1;
        System.out.println("Value of x1: "+ (d1/d));
        System.out.println("Value of x2: " + (d2/d));
        
    }
}