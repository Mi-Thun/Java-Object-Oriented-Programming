package lab9problem1;

import java.util.Scanner;

public class Calculator {
    int first, second;

    public Calculator(int first, int second) {
        this.first = first;
        this.second = second;
    }

    void Add() {
        if (first >= 0 && second >= 0) {
            System.out.println(first + second);
        } else {
            throw new ArithmeticException("Negative number found");
        }
    }

    void Subtract() {
        if (first >= 0 && second >= 0) {
            System.out.println(first - second);
        } else {
            throw new ArithmeticException("Negative number found");
        }
    }

    void Multiply() {
        if (first != 0 && second != 0) {
            System.out.println(first * second);
        } else {
            throw new ArithmeticException("Negative number found");
        }
    }

    void Division() {
        if (first != 0 && second != 0) {
            System.out.println(first / second);
        } else {
            throw new ArithmeticException("Negative number found");
        }
    }
}

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        while (true) {
            // Add.............
            System.out.print("Enter add first number: ");
            int a = input.nextInt();
            System.out.print("Enter add second number: ");
            int b = input.nextInt();
            Calculator obj1 = new Calculator(a, b);
            try {
                obj1.Add();
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            // Subtract.................
            System.out.print("Enter subtract first number: ");
            int c = input.nextInt();
            System.out.print("Enter subtract second number: ");
            int d = input.nextInt();
            Calculator obj2 = new Calculator(c, d);
            try {
                obj2.Subtract();
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            // Multiple...............
            System.out.print("Enter multiply first number: ");
            int e1 = input.nextInt();
            System.out.print("Enter multiply second number: ");
            int f = input.nextInt();
            Calculator obj3 = new Calculator(e1, f);
            try {
                obj3.Multiply();
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
            // Division..............
            System.out.print("Enter division first number: ");
            int g = input.nextInt();
            System.out.print("Enter division second number: ");
            int h = input.nextInt();
            Calculator obj4 = new Calculator(g, h);
            try {
                obj4.Division();
            } catch (ArithmeticException e) {
                System.out.println(e);
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
    }
}