package lab3problem2;

public class Lab3Problem2 {

    public static void main(String[] args) {
        int n = 1, first = 1, tem = 0;
        double avg = 0;
        for (int i = 1; n <= 20; i++) {
            System.out.print(first + " ");
            avg = avg + first;
            int second = first + tem;
            tem = first;
            first = second;
            n++;
        }
        System.out.println("\nThe average is " + avg / 20);
    }

}
