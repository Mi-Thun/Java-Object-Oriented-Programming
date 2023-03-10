package lab3problem16;

import java.util.Scanner;

public class Lab3Problem16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int num = input.nextInt();
        int l, j;
        for (l = 1; l <= num; l++) {
            for (j = 1; j <= num - l; j++) {
                System.out.print(" ");
            }
            for (j = l; j >= 1; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= l; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
        for (l = num - 1; l >= 1; l--) {
            for (j = num; j > l; j--) {
                System.out.print(" ");
            }
            for (j = l; j >= 1; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= l; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

}
