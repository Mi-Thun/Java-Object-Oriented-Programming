package lab4problem2;

import java.util.Scanner;

public class Lab4Problem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of array : ");
        int size = input.nextInt();
        int array[]=new int[size];
        int total = 0;
        for (int i = 0; i < size; i++) {
            System.out.print("element - " + i + " : ");
            array[i] = input.nextInt();
            total = total * 10 + array[i];
        }
        if (total < 9999) {
            int temp = 0;
            for (int i = size; i > 1; i--) {
                for (int j = 1; j < size; j++) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.println("The Second smallest element in the array is : " + array[1]);
        }
        else
            System.out.println("Enter valid number!");
    }
}
