public class Lab7 {
    public static int countZeroRows(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return 0;
        }
        int count = 0;
        for (double[] row : matrix) {
            boolean allZero = true;
            for (double value : row) {
                if (value != 0) {
                    allZero = false;
                    break;
                }
            }
            if (allZero) {
                count++;
            }
        }
        return count;
    }

    public static double[] sumAbsoluteValuesRows(double[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new double[0];
        }
        double[] result = new double[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            double sum = 0;
            for (double value : matrix[i]) {
                sum += Math.abs(value);
            }
            result[i] = sum;
        }
        return result;
    }

    public static int columnWithMaxSpread(double[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return -1;
        }
        int columns = matrix[0].length;
        double maxSpread = Double.NEGATIVE_INFINITY;
        int columnIndex = -1;

        for (int j = 0; j < columns; j++) {
            double min = matrix[0][j];
            double max = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            double spread = max - min;
            if (spread > maxSpread) {
                maxSpread = spread;
                columnIndex = j;
            }
        }
        return columnIndex;
    }
}