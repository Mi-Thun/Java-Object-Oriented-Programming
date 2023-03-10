package lab8ActivitiesA;

import java.util.Scanner;

abstract class Shape {
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    abstract void RectangleArea(double length, double breadth);

    //Length and Breadth
    abstract void SquareArea(double side);

    //Side
    abstract void CircleArea(double radius);

    //Radius
}

class Area extends Shape {
    void RectangleArea(double a, double b) {
        //Length and Breadth
        System.out.println(a * b);
    }

    void SquareArea(double c) {
        //Side
        System.out.println(4 * c);
    }

    void CircleArea(double d) {
        //Radius
        System.out.println(2 * 3.1416 * d);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {

            System.out.println("Press (1) for calculating Rectangle Area\n" +
                    "Press (2) for calculating Square Area\n" +
                    "Press (3) for calculating Circle Area");
            int x = input.nextInt();
            Shape a = new Area();
            if (x == 1) {
                a.RectangleArea(5, 2);
            } else if (x == 2) {
                a.SquareArea(5);
            } else if (x == 3) {
                a.CircleArea(2);
            }
        }
    }
}

