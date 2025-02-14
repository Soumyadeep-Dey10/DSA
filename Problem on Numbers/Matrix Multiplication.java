public class Main {
    static int N = 4;

    public static void multiply(int mat1[][], int mat2[][], int res[][]) {
        int i, j, k;

        // Fix: Iterate over rows of mat1
        for (i = 0; i < mat1.length; i++) {  
            // Fix: Iterate over columns of mat2
            for (j = 0; j < mat2[0].length; j++) {  
                res[i][j] = 0;
                // Fix: Iterate over columns of mat1 (or rows of mat2)
                for (k = 0; k < mat1[0].length; k++) {  
                    res[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
    }

    public static void main(String[] args) {
        int mat1[][] = { { 1, 1, 1, 1 }, 
                         { 2, 2, 2, 2 }, 
                         { 3, 3, 3, 3 }, 
                         { 4, 4, 4, 4 } };

        int mat2[][] = { { 1, 1, 1, 1 }, 
                         { 2, 2, 2, 2 }, 
                         { 3, 3, 3, 3 }, 
                         { 4, 4, 4, 4 } };

        // To store result
        int res[][] = new int[N][N];

        multiply(mat1, mat2, res);

        System.out.println("Result matrix:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }
}
