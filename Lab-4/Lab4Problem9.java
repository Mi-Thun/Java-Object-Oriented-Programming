package lab4problem9;

public class Lab4Problem9 {

    public static void main(String[] args) {
        int x = sumOfSeries();
        System.out.println("The sum of the series is : "+x);
    }

    static int sumOfSeries() {
        double a = 1, z = 0;
        for (double i = 1; i <= 5; i++) {
            for (double j = 1; j <= i; j++) {
                a = a * j;
            }
            z = z + a/i;
            a = 1;
        }
        return (int) z;
    }

}
