package lab2problem7;

import java.util.Scanner;

public class Lab2Problem7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number: ");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }

}
