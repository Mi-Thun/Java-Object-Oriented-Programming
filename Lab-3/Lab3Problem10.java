package lab3problem10;

public class Lab3Problem10 {

    public static void main(String[] args) {
        int num = 5;
        System.out.println("a.");
        int i, j, k = 1;
        for (i = 1; i <= num; i++) {
            for (j = num; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 1; j <= k; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
            k = k + 2;
        }
        int l;
        System.out.println("b.");
        for (l = 1; l <= num; l++) {
            for (j = 1; j <= num - l; j++) {
                System.out.print(" ");
            }
            for (j = l; j >= 1; j--) {
                System.out.print(j);
            }
            for (j = 2; j <= l; j++) {
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }

}
