package lab3problem3;

import java.util.Scanner;

public class Lab3Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = input.nextInt();
        int i = 1, j, x;
        do {
            x = num;
            do {
                x--;
            } while (x >= i);
            j = 1;
            do {
                System.out.print("#" + " ");
                j++;
            } while (j <= num);
            System.out.print("\n");
            i++;
        } while (i <= num);
    }
}
