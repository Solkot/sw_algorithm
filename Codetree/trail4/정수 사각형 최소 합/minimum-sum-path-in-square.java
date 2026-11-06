import java.util.*;

public class Main {
    static int[] dx = {0, -1};
    static int[] dy = {1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
                dp[i][j] = matrix[i][j] ;
            }
        }
        dp[1][n] = matrix[1][n];

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (i == 1 && j == n) continue;

                int up = Integer.MAX_VALUE;
                int right = Integer.MAX_VALUE;

                if (i - 1 >= 1) {
                    up = dp[i - 1][j];
                }
                if (j + 1 <= n) {
                    right = dp[i][j + 1];
                }

                dp[i][j] = matrix[i][j] + Math.min(up, right);
            }
        }
        System.out.println(dp[n][1]);

    }
}
