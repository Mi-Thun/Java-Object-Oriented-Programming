package lab5problem3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Fraction number[] = new Fraction[2];
        for (int i = 0; i < 2; i++) {
            number[i] = new Fraction();
            System.out.println("Enter " + (i+1) + " number...");
            System.out.print("Enter Numerator: ");
            int a = input.nextInt();
            number[i].setNumerator(a);
            System.out.print("Enter Denominator: ");
            int b = input.nextInt();
            number[i].setDenominator(b);
        }
        number[0].add(number[1]);
        number[0].sub(number[1]);
        number[0].multiplication(number[1]);
        number[0].division(number[1]);
    }
}
