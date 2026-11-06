import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n + 1][n + 1];
        int[][] dp = new int[n + 1][n + 1];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        dp[1][1] = matrix[1][1];
        
        for (int j = 2; j <= n; j++) {
            dp[1][j] = Math.min(dp[1][j - 1], matrix[1][j]);
        }
        
        for (int i = 2; i <= n; i++) {
            dp[i][1] = Math.min(dp[i - 1][1], matrix[i][1]);
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= n; j++) {
                int floor = Math.min(dp[i - 1][j], matrix[i][j]);
                int right = Math.min(dp[i][j - 1], matrix[i][j]);
                
                dp[i][j] = Math.max(floor, right);
            }
        }
        
        System.out.println(dp[n][n]);
    }
}
