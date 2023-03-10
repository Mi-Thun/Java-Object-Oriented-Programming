package lab3problem5;

import java.util.Scanner;

public class Lab3Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = input.nextInt();
        System.out.println("First : ");
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Second : ");
        int k = num;
        for (int l = 1; l <= num; l++) {
            for (int m = 1; m <= k; m++) {
                System.out.print(m + " ");
            }
            System.out.print("\n");
            k = k - 1;
        }
        System.out.println("Third : ");
        int l, j;
        for (l = 1; l <= num; l++) {
            for (j = 1; j <= num - l; j++) {
                System.out.print("  ");
            }
            for (j = l; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Four : ");
        k = num;
        int i = 0;
        for (l = 1; l <= num; l++) {
            for (i = k; k >= 1; k--) {
                System.out.print(k + " ");
            }
            System.out.print("\n");
            k = num - l;
        }
    }

}
