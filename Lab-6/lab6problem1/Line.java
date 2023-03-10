package lab6problem1;

public class Line {
    private double[] arr = new double[4];

    public Line() {
        arr[0] = 0;
        arr[1] = 0;
        arr[2] = 0;
        arr[3] = 0;
    }

    public double getX1() {
        return arr[0];
    }

    public void setX1(double x1) {
        arr[0] = x1;
    }

    public double getY1() {
        return arr[1];
    }

    public void setY1(double y1) {
        arr[1] = y1;
    }

    public double getX2() {
        return arr[2];
    }

    public void setX2(double x2) {
        arr[2] = x2;
    }

    public double getY2() {
        return arr[3];
    }

    public void setY2(double y2) {
        arr[3] = y2;
    }

    double findSlope() {
        double slope = (arr[3] - arr[1]) / (arr[2] - arr[0]);
        return slope;
    }

    public String toString() {
        return "Line has points (" + arr[0] + ", " + arr[1] + ")" + " and " +
                "(" + arr[2] + ", " + arr[3] + ")";
    }

    public static void isIntersecting(Line a, Line b) {
        double slope1 = a.findSlope();
        double slope2 = b.findSlope();
        if (slope1 == slope2) {
            System.out.println("True");
        } else
            System.out.println("False");
    }
}