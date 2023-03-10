package lab5problem3;

public class Fraction {
    private int numerator, denominator;

    Fraction() {
    }

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    int getNumerator() {
        return numerator;
    }

    int getDenominator() {
        return denominator;
    }

    void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return "Result = " + numerator + " / " + denominator;
    }

    void add(Fraction x) {
        int sum = this.numerator*x.getDenominator()+
                this.denominator * x.getNumerator();
        int sum1 = this.denominator*x.getDenominator();
        System.out.println(sum+ " / "+ sum1);
    }

    void sub(Fraction x) {
        int sum = this.numerator*x.getDenominator()-
                this.denominator*x.getNumerator();
        int sum1 = this.denominator*x.getDenominator();
        System.out.println(sum+ " / "+ sum1);
    }

    void multiplication(Fraction x) {
        int sum = this.numerator*x.getNumerator();
        int sum1 = this.denominator*x.getDenominator();
        System.out.println(sum+ " / "+ sum1);
    }

    void division(Fraction x) {
        int sum = this.numerator*x.getDenominator();
        int sum1 = this.denominator * x.getNumerator();;
        System.out.println(sum+ " / "+ sum1);
    }

}
