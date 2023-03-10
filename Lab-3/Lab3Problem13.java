package lab3problem13;

import java.util.Scanner;

public class Lab3Problem13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inter a number here: ");
        int a = input.nextInt();
        int i = 0, count = 1;
        while (i < a) {
            int j = a;
            while (j > i) {
                System.out.print("  ");
                j--;
            }
            count = 1;
            int k = 0;
            while (k <= i) {
                System.out.print(count + "   ");
                count = count * (i - k) / (k + 1);
                k++;
            }
            System.out.println();
            i++;
        }
    }

}
