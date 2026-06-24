import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ArrayTasksTest {

    int[] s = {-2, 5, -1, 4, 0, 3, -6, 2, 1, -5, 7, 8, -3, 6, 9};
    @Test
    void testPositiveProductAndCount() {
        int[] expected = {362880, 9};
        int[] actual = ArrayTasks.positiveProductAndCount(s);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testCreateRArray() {
        int[] expected = {
                -7, 21, -3, 17, 1,
                13, -23, 9, 5, -19,
                29, 33, -11, 25, 37
        };
        int[] actual = ArrayTasks.createRArray(s);

        assertArrayEquals(expected, actual);
    }

    @Test
    void testNegativeSumAndCount() {
        int[] r = ArrayTasks.createRArray(s);
        int[] expected = {-80, 10};
        int[] actual = ArrayTasks.negativeSumAndCount(s, r);
        assertArrayEquals(expected, actual);
    }
}