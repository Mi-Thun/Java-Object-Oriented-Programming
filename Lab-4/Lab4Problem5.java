package lab4problem5;

import java.util.Scanner;

public class Lab4Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input elements in the first matrix :");
        int matrix[][] = new int[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print("element - [" + i + "],[" + j + "] :");
                matrix[i][j] = input.nextInt();
            }
        }
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        sum = (matrix[0][0] * ((matrix[1][1] * matrix[2][2]) - (matrix[1][2] * matrix[2][1])))
                + (matrix[0][1] * ((matrix[1][0] * matrix[2][2]) - (matrix[1][2] * matrix[2][0]))) +
                (matrix[0][2] * ((matrix[1][0] * matrix[2][1]) - (matrix[1][1] * matrix[2][0])));
        System.out.println("The Determinant of the matrix is: "+ sum);
    }
}
