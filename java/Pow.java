// We should consider whether x and n is negetive, zero or positive.
// To avoid the unnecessary multiply, we can compare current result with the previous one, if they are equal, we stop.
// time is about O(n), space is O(1).
public class Solution {
    public double myPow(double x, int n) {
        if (n ==0 ) return 1;
        int negetive = x < 0 ? -1 : 1;
        x = x < 0 ? -x: x;
        int sign = n > 0 ? 1 : -1;
        n *= sign;
        double result = x, pre = x;
        for (int i = 1; i < n; ++i) {
            result *= x;
            if (result == pre)
                break;
            pre = result;
        }
        if (sign == -1) {
            result = 1.0/result;
        }
        if (negetive == -1) {
            return n%2 == 0 ? result : -result;
        }
        return result;
    }
}
