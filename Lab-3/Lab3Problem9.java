package lab3problem9;

public class Lab3Problem9 {

    public static void main(String[] args) {
        int[] a = {10, 22, 33, 14, 15, 86, 67, 58, 19, 1};
        int b = a.length;
        System.out.println(b);
        for (int i = 0; i < b; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }
        for (int i = 0; i < b; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

}
