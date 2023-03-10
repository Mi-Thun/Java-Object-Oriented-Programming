package lab2problem4;

import java.util.Scanner;

public class Lab2Problem4 {

    public static void main(String[] args) {

        System.out.println("Enter Number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for (int i = a;; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println("nextPrime(" + a + ") --> " + i);
                break;
            }
        }
        return;
    }

}
