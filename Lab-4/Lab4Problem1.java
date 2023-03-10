package lab4problem1;

public class Lab4Problem1 {

    public static void main (String[] args) {
        int[] array = {8, 5, 3, 7, 9, 1, 4, 2, 6};
        int temp = 0;
        int length = array.length;
        for (int i = length; i > 1; i--) {
            for (int j = 1; j < length; j++) {
                if (array[j - 1] > array[j]) {
                    temp = array[j-1];
                    array[j-1]= array[j];
                    array[j]= temp;
                }
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
