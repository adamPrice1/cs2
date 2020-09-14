public class DoubleFactorial {

    private static int factorial2(int n) {
        if (n <= 2) {
            return n;
        }
        return n * DoubleFactorial.factorial2(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(DoubleFactorial.factorial2(6));
        System.out.println(DoubleFactorial.factorial2(5));
        System.out.println(DoubleFactorial.factorial2(4));
    }
}
