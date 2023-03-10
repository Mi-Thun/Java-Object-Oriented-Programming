package ActivitiesA;

import java.io.IOException;

public class ArithmeticException_Demo {
    public static void main(String args[]) {
        try {
            int a = 30, b = 0;
            int c = a / b;
            System.out.println("Result = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Can't divide a number by 0");
        }
    }
}

class Testthrows1 {
    Void m() throws IOException {
        throw new IOException("device error");
    }
}