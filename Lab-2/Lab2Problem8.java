package lab2problem8;

import java.util.Scanner;

public class Lab2Problem8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number Here: ");
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j < number + 1; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum++;
            }
        }
        System.out.println("primeNumber(" + number + ") --> " + sum);

    }

}
