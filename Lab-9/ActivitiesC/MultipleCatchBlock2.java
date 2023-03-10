package ActivitiesC;

public class MultipleCatchBlock2 {
    public static void main(String args[]) {
        try {
            int a[] = new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e) {
            System.out.println("task1 is completed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("task 2 completed");
        } catch (Exception e) {
            System.out.println("common task completed");
        }
        System.out.println("rest of the code....");
    }
}
