package Lab4Problem17;

public class Complex {
    double realPart, imaginaryPart;

    public Complex() {
        this.realPart = 0;
        this.imaginaryPart = 0;
    }
    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    public Complex add (Complex otherNumber) {
        Complex temp = new Complex();
        temp.realPart = this.realPart + otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart + otherNumber.imaginaryPart;
        return temp;
    }
    public Complex subtract (Complex otherNumber) {
        Complex temp = new Complex();
        temp.realPart = this.realPart - otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart - otherNumber.imaginaryPart;
        return temp;
    }
    public Complex multiply (Complex otherNumber) {
        Complex temp = new Complex();
        temp.realPart = this.realPart * otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart * otherNumber.imaginaryPart;
        return temp;
    }
    public Complex divide (Complex otherNumber) {
        Complex temp = new Complex();
        temp.realPart = this.realPart / otherNumber.realPart;
        temp.imaginaryPart = this.imaginaryPart / otherNumber.imaginaryPart;
        return temp;
    }
    public void setRealPart (double realPart) {
        this.realPart = realPart;
    }
    public void setImaginaryPart (double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public double getRealPart() {
        return realPart;
    }
    public double getImaginaryPart() {
        return imaginaryPart;
    }
    public String toString() {
        return "Complex: " + "realPart=" + realPart + ", imaginaryPart=" + imaginaryPart;
    }

}
