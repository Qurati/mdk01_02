public class Lab6 {
    public static int[][] createMatrixA(int N, int M) {
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = 5 * (i + 1);
            }
        }
        return matrix;
    }

    public static int[][] createMatrixJ(int N, int M) {
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = i * i * j * j;
            }
        }
        return matrix;
    }

    public static int[][] createMatrixK(int N, int M) {
        int[][] matrix = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = (i * j) % 4;
            }
        }
        return matrix;
    }
}