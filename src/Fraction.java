
public class Fraction {
    public final int numerator;
    public final int denominator;

    public Fraction(int numerator, int denominator) {

        if (denominator == 0){
            throw new ArithmeticException();
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction(Fraction other) {
        this.numerator = other.numerator;
        this.denominator = other.denominator;
    }

    public int numMultiply(int multiplier) { return this.numerator * multiplier; }

    public int denMultiply(int multiplier) { return this.denominator * multiplier; }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public Fraction add(Fraction other) {

        int newDenominator = this.denominator*other.denominator;
        int newNumerator = this.numerator*other.denominator +
                           other.numerator*this.denominator;

        int gcd = gcd(this.denominator, other.denominator);

        return new Fraction(newNumerator/gcd, newDenominator/gcd);
    }

    @Override
    public String toString() {
        return this.numerator + " / " + this.denominator;
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Fraction)){
            return false;
        }

        Fraction that = (Fraction) other;

        return this.numerator == that.numerator && this.denominator == that.denominator;
    }
}
