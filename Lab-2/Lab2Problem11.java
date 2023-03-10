package lab2problem11;

import java.util.Scanner;

public class Lab2Problem11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three number here: ");
        double c = 0;
        for (int i = 1; i < 4; i++) {
            double a = input.nextDouble();
            c = a + c;
        }
        System.out.println(c / 3);
    }

}
