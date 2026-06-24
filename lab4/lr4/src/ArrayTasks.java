import java.util.Arrays;

public class ArrayTasks {
    public static int[] positiveProductAndCount(int[] s) {
        int product = 1;
        int count = 0;
        for (int value : s) {
            if (value > 0) {
                product *= value;
                count++;
            }
        }
        if (count == 0) {
            product = 0;
        }
        return new int[]{product, count};
    }
    public static int[] createRArray(int[] s) {
        int[] r = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            r[i] = 4 * s[i] + 1;
        }
        return r;
    }
    public static int[] negativeSumAndCount(int[] s, int[] r) {
        int sum = 0;
        int count = 0;
        for (int value : s) {
            if (value < 0) {
                sum += value;
                count++;
            }
        }
        for (int value : r) {
            if (value < 0) {
                sum += value;
                count++;
            }
        }
        return new int[]{sum, count};
    }
}