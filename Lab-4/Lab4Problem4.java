package lab4problem4;

import java.util.Scanner;

public class Lab4Problem4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the size of the square matrix : ");
        int size = input.nextInt();
        System.out.println("Input elements in the first matrix :");
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println("The matrix is : ");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int diagonal = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(i==j) {
                    diagonal = diagonal + (matrix[i][j]);
                }
            }
        }
        System.out.print("Addition of the right Diagonal elements is : " + diagonal);
    }
}
