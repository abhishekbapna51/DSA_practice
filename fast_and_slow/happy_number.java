public class happy_number {
    // Helper to compute sum of squares of digits
    private int next(int n) {
        int total = 0;
        while (n > 0) {
            int d = n % 10;
            total += d * d;
            n /= 10;
        }
        return total;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = next(n);

        while (slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }

        return slow == 1;
    }
}
