package lab3problem11;

import java.util.Scanner;

public class Lab3Problem11 {

    public static void main(String[] args) {
        double sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number here: ");
        int num = input.nextInt();
        for (int i = 1; i <= num; i = i + 1) {
            sum = sum + 1 / (double) i;
        }
        System.out.println(sum);
    }
}
