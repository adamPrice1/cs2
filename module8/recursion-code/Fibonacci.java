public class Fibonacci {
    private static int Fib(int n) {
        if (n <= 1) {
            return n;
        }
        return Fibonacci.Fib(n - 1) + Fibonacci.Fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci.Fib(0));
        System.out.println(Fibonacci.Fib(1));
        System.out.println(Fibonacci.Fib(4));
        System.out.println(Fibonacci.Fib(5));
        System.out.println(Fibonacci.Fib(6));
        System.out.println(Fibonacci.Fib(7));
        System.out.println(Fibonacci.Fib(8));
        System.out.println(Fibonacci.Fib(30));
    }
}
