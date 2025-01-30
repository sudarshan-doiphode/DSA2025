package array2d;

public class TransponseOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
//        int[][] transpose = transpose(arr);
        transposeInPlace(arr);
        print2DArray(arr);

    }

    private static void transposeInPlace(int[][] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < arr[i].length; j++) {
                if (i == j) continue;
                else {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
    }

    static int[][] transpose(int[][] arr) {
        int n = arr.length;
        int[][] ans = new int[n][n];
        for (int col = 0; col < arr.length; col++) {
            for (int row = 0; row < arr.length; row++) {
                ans[col][row] = arr[row][col];
            }
        }
        return ans;
    }

    static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
