package lab3problem14;

import java.util.Scanner;

public class Lab3Problem14 {

    public static void main(String[] args) {
        int i, j = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number here: ");
        int num = input.nextInt();
        for (i = 1; i <= num; i++) {
            j = j * i;
        }
        System.out.println(j);
    }

}
