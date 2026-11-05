import java.util.*;

public class Main {
    static int[] dx = {0, -1};
    static int[] dy = {-1, 0};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int max = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int r = 0; r < 2; r++){
                    int nx = i + dx[r];
                    int ny = j + dy[r];
                    if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                        dp[i][j] = Math.max(dp[i][j], matrix[i][j] + dp[nx][ny]);
                        max = Math.max(max, dp[i][j]);                    
                    }else{
                        dp[i][j] = Math.max(dp[i][j],  matrix[i][j]);
                        max = Math.max(max, dp[i][j]);
                    }
                }
            }
        }

        // for (int i = 0; i < n; i++) {
        //     System.out.println(Arrays.toString(dp[i]));
        // }
        System.out.println(max);

    }
}