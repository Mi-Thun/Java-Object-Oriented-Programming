package lab3problem15;

import java.util.Scanner;

public class Lab3Problem15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int num = input.nextInt();
        int p = num;
        int j = 1, tem = 0;
        do {
            j = num % 10;
            tem = tem * 10 + j;
            num = num / 10;

        } while (num % 10 != 0);
        System.out.println("Original number :" + p);
        System.out.println("Reverse number :" + tem);
    }

}
