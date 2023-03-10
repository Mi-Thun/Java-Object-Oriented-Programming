package lab9problem2;

import java.util.Scanner;

public class MyException extends Exception{
    MyException(String s) {
        super(s);
    }
}

class Product {
    public static void productCheck(int weight) throws MyException {
        if (weight < 100) {
            throw new MyException("Product is invalid");
        } else {
            System.out.println(weight);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter weight: ");
            int n = input.nextInt();
            Product obj = new Product();
            try {
                obj.productCheck(n);
            } catch (MyException e) {
                e.printStackTrace();
            }
        }
    }
}

