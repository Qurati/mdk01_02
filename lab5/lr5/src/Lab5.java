public class Lab5 {
    static double fact(int x) {
        double f = 1;
        for (int i = 1; i <= x; i++) {
            f *= i;
        }
        return f;
    }
    static double p(int a, int k) {
        double res = 1;
        for (int i = 1; i <= k; i++) {
            res *= a;
        }
        return res;
    }
    static double GetResult(int[] k, int[] c, int[] x) {
        double s = 0;
        for (int i = 0; i < k.length; i++) {
            s += p(x[i] - c[i], k[i]) /
                    (fact(c[i]) - fact(k[i] - c[i]));
        }
        return s;
    }
}