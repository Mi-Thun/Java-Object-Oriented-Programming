package lab3problem7;

public class Lab3Problem7 {

    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= 7 - i; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

}
