package lab3problem4;

import java.util.Scanner;

public class Lab3Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inter a number here: ");
        int a = input.nextInt();
        int i = 1;
        int x = 0;
        System.out.println("a.");
        while (x < a) {
            int j = a;
            while (j > x + 1) {
                System.out.print("  ");
                j--;
            }
            int k = 0;
            while (k < i) {
                System.out.print("# ");
                k++;
            }
            System.out.println();
            i += 2;
            x++;
        }
        x = 0;
        i = 1;
        System.out.println("b.");
        while (x != a) {
            int j = 1;
            while (j <= x) {
                System.out.print("  ");
                j++;
            }
            int k = a * 2 - 1;
            while (k >= i) {
                System.out.print("# ");
                k--;
            }
            System.out.println();
            i += 2;
            x++;
        }

    }
}
