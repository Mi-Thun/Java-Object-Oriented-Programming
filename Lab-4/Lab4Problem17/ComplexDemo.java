package Lab4Problem17;

import java.util.Scanner;

public class ComplexDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Complex A1 = new Complex();
        System.out.print("Enter Real Part:");
        double realPart = input.nextDouble();
        System.out.print("Enter Imaginary Part:");
        double imaginaryPart = input.nextDouble();
        A1.setRealPart(realPart);
        A1.setImaginaryPart(imaginaryPart);
        System.out.println("Here  enter other number....");
        System.out.print("Enter Real Part");
        double a = input.nextInt();
        System.out.print("Enter Imaginary Part");
        double b = input.nextInt();
        Complex A2 = new Complex(a,b);
        System.out.println(A1.add(A2));
        System.out.println(A1.subtract(A2));
        System.out.println(A1.multiply(A2));
        System.out.println(A1.divide(A2));

    }
}
