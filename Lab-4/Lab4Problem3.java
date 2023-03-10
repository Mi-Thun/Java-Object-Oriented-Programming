package lab4problem3;

import java.util.Scanner;

public class Lab4Problem3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the rows and columns of first matrix : ");
        int row1 = input.nextInt();
        int column1 = input.nextInt();
        System.out.print("Input the rows and columns of second matrix : ");
        int row2 = input.nextInt();
        int column2 = input.nextInt();
        int i , j, k , l, m, n, o;

        System.out.println("Input elements in the first matrix : ");
        int array1[][] = new int[row1][column1];
        for (i = 0; i < row1; i++) {
            for (j = 0; j < column1; j++) {
                System.out.print("element - [" + i + "],[" + j + "] : ");
                array1[i][j] = input.nextInt();
            }
        }
        System.out.println("Input elements in the second matrix : ");
        int array2[][] = new int[row2][column2];
        for (k = 0; k < row2; k++) {
            for (l = 0; l < column2; l++) {
                System.out.print("element - [" + k + "],[" + l + "] : ");
                array2[k][l] = input.nextInt();
            }
        }
        System.out.println("The First matrix is : ");
        for (i = 0; i < row1; i++) {
            for (j = 0; j < column1; j++) {
                System.out.print(array1[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println("The Second matrix is : ");
        for (k = 0; k < row2; k++) {
            for (l = 0; l < column2; l++) {
                System.out.print(array2[k][l] +" ");
            }
            System.out.println();
        }
        System.out.println("The multiplication of two matrix is : ");
        int array3[][] = new int[row1][column2];
        for(m = 0; m < row1; m++) {
            for (n = 0; n < column2; n++) {
                array3[m][n] = 0;
                for (o = 0; o < column1; o++) {
                    array3[m][n] = array3[m][n] + (array1[m][o] * array2[o][n]);
                }
                System.out.print(array3[m][n] + " ");
            }
            System.out.println("");
        }

    }
}
