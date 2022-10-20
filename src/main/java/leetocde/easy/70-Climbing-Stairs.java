package leetocde.easy;

class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 0) return n;
        if (n == 1) return n;
        if (n == 2) return n;

        int n1 = 1, n2 = 2, fib = 0;

        for (int i = 2; i < n; i++) {
            fib = n1 + n2;

            n1 = n2;
            n2 = fib;
        }
        return fib;
    }
}
