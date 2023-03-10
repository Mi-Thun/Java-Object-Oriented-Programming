package lab7problem5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r1 = new Rectangle(2, 5);
        r1.printArea();
        r1.printPerimeter();

        System.out.println("-------------------------------");

        Square[] newSquare = new Square[10];
        int x = 1;
        for (int i = 0; i < 10; i++) {
            newSquare[i] = new Square(x);
            x++;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Print " + (i + 1) + " Square result given bellow.......");
            newSquare[i].printArea();
        }
    }
}
