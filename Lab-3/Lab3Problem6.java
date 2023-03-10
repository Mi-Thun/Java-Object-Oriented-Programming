package lab3problem6;

import java.util.Scanner;

public class Lab3Problem6 {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean hasWon = false;

        System.out.println("Randomly chosen a number.");
        System.out.println("Try to guess it: ");

        Scanner scanner = new Scanner(System.in);
        for (;;) {
            int guess = scanner.nextInt();

            if (randomNumber < guess) {
                System.out.println("It's smaller than " + guess + ".");
            } else if (randomNumber > guess) {
                System.out.println("It's greater than " + guess + ".");
            } else if (randomNumber == guess) {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("YOU WIN!!!");
        } else {
            System.out.println("YOU LOSE!!!");
            System.out.println("The number was : " + randomNumber);
        }
    }

}
