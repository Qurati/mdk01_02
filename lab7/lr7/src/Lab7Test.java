import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Lab7Test {

    @Test
    void testCountZeroRowsTypical() {
        double[][] matrix = {
                {0, 0},
                {1, 0},
                {0, 0}
        };

        assertEquals(2, Lab7.countZeroRows(matrix));
    }

    @Test
    void testCountZeroRowsNoZeroRows() {
        double[][] matrix = {
                {1, 2},
                {3, 4}
        };

        assertEquals(0, Lab7.countZeroRows(matrix));
    }

    @Test
    void testCountZeroRowsAllZeroRows() {
        double[][] matrix = {
                {0, 0},
                {0, 0}
        };

        assertEquals(2, Lab7.countZeroRows(matrix));
    }

    @Test
    void testCountZeroRowsEmptyMatrix() {
        double[][] matrix = new double[0][0];

        assertEquals(0, Lab7.countZeroRows(matrix));
    }

    @Test
    void testCountZeroRowsNullMatrix() {
        assertEquals(0, Lab7.countZeroRows(null));
    }

    @Test
    void testSumAbsoluteValuesTypical() {
        double[][] matrix = {
                {-1, 2},
                {-3, -4},
                {5, -6}
        };

        double[] expected = {3, 7, 11};

        assertArrayEquals(expected, Lab7.sumAbsoluteValuesRows(matrix));
    }

    @Test
    void testSumAbsoluteValuesZeros() {
        double[][] matrix = {
                {0, 0},
                {0, 0}
        };

        double[] expected = {0, 0};

        assertArrayEquals(expected, Lab7.sumAbsoluteValuesRows(matrix));
    }

    @Test
    void testSumAbsoluteValuesSingleRow() {
        double[][] matrix = {
                {-5, 4, -3}
        };

        double[] expected = {12};

        assertArrayEquals(expected, Lab7.sumAbsoluteValuesRows(matrix));
    }

    @Test
    void testSumAbsoluteValuesEmptyMatrix() {
        double[][] matrix = new double[0][0];

        assertArrayEquals(new double[0], Lab7.sumAbsoluteValuesRows(matrix));
    }

    @Test
    void testSumAbsoluteValuesNullMatrix() {
        assertArrayEquals(new double[0], Lab7.sumAbsoluteValuesRows(null));
    }


    @Test
    void testColumnWithMaxSpreadTypical() {
        double[][] matrix = {
                {1, 2, 3},
                {4, 10, 6},
                {7, 5, 9}
        };

        assertEquals(1, Lab7.columnWithMaxSpread(matrix));
    }

    @Test
    void testColumnWithMaxSpreadFirstColumn() {
        double[][] matrix = {
                {10, 2},
                {0, 3},
                {-5, 4}
        };

        assertEquals(0, Lab7.columnWithMaxSpread(matrix));
    }

    @Test
    void testColumnWithMaxSpreadEqualSpread() {
        double[][] matrix = {
                {1, 2},
                {3, 4}
        };

        assertEquals(0, Lab7.columnWithMaxSpread(matrix));
    }

    @Test
    void testColumnWithMaxSpreadSingleColumn() {
        double[][] matrix = {
                {1},
                {5},
                {3}
        };

        assertEquals(0, Lab7.columnWithMaxSpread(matrix));
    }

    @Test
    void testColumnWithMaxSpreadEmptyMatrix() {
        double[][] matrix = new double[0][0];

        assertEquals(-1, Lab7.columnWithMaxSpread(matrix));
    }

    @Test
    void testColumnWithMaxSpreadNullMatrix() {
        assertEquals(-1, Lab7.columnWithMaxSpread(null));
    }
}