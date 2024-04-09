import java.util.Scanner;

public class task7 {

        public static void fillSpiral(int[][] arr, int n, int x, int y) {
            if (n <= 0) return;
            for (int i = 0; i < n; i++) {
                arr[x][x + i] = y++;
            }
            for (int i = 1; i < n; i++) {
                arr[x + i][x + n - 1] = y++;
            }
            for (int i = n - 2; i >= 0; i--) {
                arr[x + n - 1][x + i] = y++;
            }
            for (int i = n - 2; i > 0; i--) {
                arr[x + i][x] = y++;
            }
            fillSpiral(arr, n - 2, x + 1, y);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            int N = scanner.nextInt();
            int[][] matrix = new int[N][N];
            fillSpiral(matrix, N, 0, 1);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
}
