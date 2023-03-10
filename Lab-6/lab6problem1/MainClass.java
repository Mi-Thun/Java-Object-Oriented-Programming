package lab6problem1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Line line1 = new Line();
        System.out.println("Enter Line one value here....");
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                System.out.print("Enter X1: ");
                double a = input.nextDouble();
                line1.setX1(a);
            }
            if (i == 1) {
                System.out.print("Enter Y1: ");
                double a = input.nextDouble();
                line1.setY1(a);
            }
            if (i == 2) {
                System.out.print("Enter X2: ");
                double a = input.nextDouble();
                line1.setX2(a);
            }
            if (i == 3) {
                System.out.print("Enter Y2: ");
                double a = input.nextDouble();
                line1.setY2(a);
            }
        }
        Line line2 = new Line();
        System.out.println("Enter Line two value here....");
        for (int i = 0; i <= 3; i++) {
            if (i == 0) {
                System.out.print("Enter X1: ");
                double a = input.nextDouble();
                line2.setX1(a);
            }
            if (i == 1) {
                System.out.print("Enter Y1: ");
                double a = input.nextDouble();
                line2.setY1(a);
            }
            if (i == 2) {
                System.out.print("Enter X2: ");
                double a = input.nextDouble();
                line2.setX2(a);
            }
            if (i == 3) {
                System.out.print("Enter Y2: ");
                double a = input.nextDouble();
                line2.setY2(a);
            }
        }
        System.out.println("Line 1: ");
        System.out.println(line1.toString());
        System.out.println("Line 2: ");
        System.out.println(line2.toString());
        System.out.print("Line 1 slope is: ");
        System.out.println(line1.findSlope());
        System.out.print("Line 2 slope is: ");
        System.out.println(line2.findSlope());
        System.out.println("If ine are intersecting print true else false.....");
        System.out.print("Result is: ");
        Line.isIntersecting(line1, line2);
    }
}
