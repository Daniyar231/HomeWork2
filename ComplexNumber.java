public class ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumber(double realPart) {
        this.realPart = realPart;
        this.imaginaryPart = 0;
    }

    public ComplexNumber(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        double newRealPart = this.realPart + other.realPart;
        double newImaginaryPart = this.imaginaryPart + other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double newRealPart = this.realPart - other.realPart;
        double newImaginaryPart = this.imaginaryPart - other.imaginaryPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = this.realPart * other.realPart - this.imaginaryPart * other.imaginaryPart;
        double newImaginaryPart = this.realPart * other.imaginaryPart + this.imaginaryPart * other.realPart;
        return new ComplexNumber(newRealPart, newImaginaryPart);
    }

    public double getMagnitude() {
        return Math.sqrt(this.realPart * this.realPart + this.imaginaryPart * this.imaginaryPart);
    }

    @Override
    public String toString() {
        if (this.imaginaryPart >= 0) {
            return this.realPart + " + " + this.imaginaryPart + "i";
        } else {
            return this.realPart + " - " + (-this.imaginaryPart) + "i";
        }
    }
}

