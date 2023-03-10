package lab4problem13;

import java.util.Scanner;

public class Lab4Problem13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(factorial(number));
    }

    static int factorial(int a) {
        if (a == 1) {
            return 1;
        } else {
            return (a * factorial(a - 1));
        }
    }

}
