package leetocde.easy;

class Fibonacci {
    public int fib(int n) {
        if (n == 0) return n;
        if (n == 1) return n;

        int n1 = 0, n2 = 1, fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = n1 + n2;

            n1 = n2;
            n2 = fib;
        }
        return fib;
    }
}
