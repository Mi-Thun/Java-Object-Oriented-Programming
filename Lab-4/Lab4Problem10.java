package lab4problem10;

import java.util.Scanner;

public class Lab4Problem10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input any number: ");
        int number = input.nextInt();
        checkArmstrong(number);
        checkPerfect(number);
    }

    static void checkArmstrong(int j) {
        int a = 0, k = 0, e = j, d = 0;
        while (e != 0) {
            e /= 10;
            d++;
        }
        e = j;
        for (; j != 0; ) {
            a = j % 10;
            k = (int) (k + Math.pow(a, d));
            j = j / 10;
        }
        if (k == e) {
            System.out.println("The " + e + " is an Armstrong number.");
        } else {
            System.out.println("The " + e + " is not an Armstrong number.");
        }
    }

    static void checkPerfect(int i) {
        int k = 0, m = 0;
        for (k = 1;k <= i/2; k++) {
            if (i % k == 0) {
                m = m + k;
            }
        }
        if (m == i) {
            System.out.println("The " + i + " is a Perfect number.");
        } else {
            System.out.println("The " + i + " is not a Perfect number.");
        }
    }

}
