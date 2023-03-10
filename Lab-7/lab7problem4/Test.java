package lab7problem4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle r1 = new Rectangle(4, 5);
        r1.printArea();
        r1.printPerimeter();
        System.out.println("Square result: ");
        Square s1 = new Square(2);
        s1.printArea();
        s1.printPerimeter();
    }
}
