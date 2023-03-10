package lab3problem19;

import static java.lang.Math.pow;
import java.util.Scanner;

public class Lab3Problem19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter x here: ");
        int x1 = input.nextInt();
        double x = x1 * (3.1416 / 180);
        System.out.println("Enter n here: ");
        int n = input.nextInt();
        double sum = 0, j = 1;
        for (int i = 1; i <= n; i++) {
            double k = 1;
            for (int m = 1; m <= j; m++) {
                k = k * m;
            }
            if (i % 2 == 0) {
                sum = sum - (pow(x, j) / k);
            } else {
                sum = sum + (pow(x, j) / k);
            }
            j = j + 2;
        }

        System.out.println("sin " + x1 + " = " + sum);
        return;
    }

}
