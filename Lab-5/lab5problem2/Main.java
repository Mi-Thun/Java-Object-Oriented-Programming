package lab5problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book array[] = new Book[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter ISBN here: ");
            int a = input.nextInt();
            System.out.print("Enter book tittle here: ");
            String b = input.next();
            System.out.print("Enter number of page here: ");
            int c = input.nextInt();
            array[i] = new Book();
            array[i].setISBN(a);
            array[i].setBookTitle(b);
            array[i].setNumberOfPage(c);
            input.nextLine();
        }
        displayAll(array);
        System.out.println("Which two book you want compare to ...");
        System.out.print("Enter first book number: ");
        int first = input.nextInt();
        first = first - 1;
        Book co1 = new Book();
        co1 = array[first];
        System.out.print("Enter second book number: ");
        int second = input.nextInt();
        second = second - 1;
        Book co2 = new Book();
        co2 = array[second];
        System.out.println("Compare result is = " + compareTo(co1,co2));
        System.out.println("Which book you want to check is heavier or not ...");
        System.out.print("Enter book number here: ");
        int checkHeavier = input.nextInt();
        checkHeavier = checkHeavier - 1;
        Book check = new Book();
        check = array[checkHeavier];
        System.out.println("is Heavier = " + isHeavier(check));
    }

    static boolean isHeavier(Book check) {
        boolean b =false;
        if (check.getNumberOfPage() > 500) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }

    static int compareTo(Book c, Book b) {
        int a = 0;
        if (c.getNumberOfPage() == (b.getNumberOfPage())) {
            a = 0;
        }
        if (c.getNumberOfPage() > (b.getNumberOfPage())) {
            a = 1;
        }
        if (c.getNumberOfPage() < (b.getNumberOfPage())) {
            a = -1;
        }
        return a;
    }

    static void displayAll(Book array[]) {
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i].toString());
        }
    }
}
