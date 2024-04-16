import java.lang.Math;

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
        System.out.println(a);
        return a;
    }

    public Fraction add(Fraction other) {
        int temp = 0;
        if (other.denominator > this.denominator) {
            temp = other.denominator;
        }
        if (this.denominator > other.denominator) {
            temp = this.denominator;
        }
        int newNum1 = this.numerator*temp;
        int newDen1 = this.denominator*temp;
        int newNum2 = other.numerator*temp;
        int newDen2 = other.denominator*temp;
        int gcd = gcd(this.denominator, other.denominator);

        int reduce1 = newNum1/gcd;
        int reduce2 = newDen1/gcd;
        int reduce3 = newNum2/gcd;
        int reduce4 = newDen2/gcd;
        return new Fraction(newNum1, newDen1);

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
