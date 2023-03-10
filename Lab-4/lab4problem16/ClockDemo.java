package lab4problem16;

import java.util.Scanner;

public class ClockDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Clock c1 = new Clock(356);
        for (int second = 1; second <= 5; second++) {
            c1.tick();
        }
        System.out.print("Enter hours between 0-23: ");
        int hour = input.nextInt();
        System.out.print("Enter minutes between 0-59: ");
        int min = input.nextInt();
        System.out.print("Enter seconds between 0-59: ");
        int secs = input.nextInt();

        Clock c2 = new Clock(hour, min, secs);
        for (int second = 1; second <= 5; second++) {
            c2.tickDown();
        }

        System.out.println(Clock.addClock(c1,c2));

        System.out.println(c1.toString());
        System.out.println(c2.toString());

    }
}
