public class Math2 {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;

    public static int max(int a, int b){
        if (a > b) {
            return a;
        }
        if (b > a) {
            return b;
        }
        return a;
    }

    public static double max(double a, double b){
        if (a > b) {
            return a;
        }
        if (b > a) {
            return b;
        }
        return a;
    }

    public static int pow(int base, int exponent){
        if (exponent == 0){
            return 1;
        }
        int newBase = base;
        for (int i = 1; i <= exponent; i++){
            newBase *= base;
        }
        return newBase;
    }

}

