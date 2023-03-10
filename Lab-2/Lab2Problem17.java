package lab2problem17;

import java.util.Scanner;

public class Lab2Problem17 {

    public static void main(String[] args) {
     
        Scanner input = new Scanner(System.in);
        System.out.println("Input number here: ");
        int a = input.nextInt();
        int d = a;
        if (a < 0) {
            a = a * (-1);
        }
        int b = 0;
        for (int i = 1; a % 10 != 0; i++) {
            int c = a % 10;
            b = b * 10 + c;
            a = a / 10;
        }
        System.out.println("rev(" + d + ") --> " + "\"" + b + "\"");
    }

}
