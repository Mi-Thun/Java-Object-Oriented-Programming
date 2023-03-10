package lab2problem21;

import java.util.Scanner;

public class Lab2Problem21 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int i = 0;
        int num = 0, sum = 0, r = 0;
        for (i = 1; r < 100; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                r++;
                sum = sum + i;
            }
        }
        System.out.println("Sum of the first 100 prime number: " + sum);
    }

}
