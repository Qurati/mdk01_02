import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Lab6Test {

    @Test
    void testCreateMatrixA() {
        int[][] expected = {
                {5, 5, 5},
                {10, 10, 10},
                {15, 15, 15}
        };
        assertArrayEquals(expected, Lab6.createMatrixA(3, 3));
    }

    @Test
    void testCreateMatrixJ() {
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 4},
                {0, 4, 16}
        };
        assertArrayEquals(expected, Lab6.createMatrixJ(3, 3));
    }

    @Test
    void testCreateMatrixK() {
        int[][] expected = {
                {0, 0, 0},
                {0, 1, 2},
                {0, 2, 0}
        };
        assertArrayEquals(expected, Lab6.createMatrixK(3, 3));
    }
}