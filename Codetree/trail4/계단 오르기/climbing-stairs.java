import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[1001];

        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 1;
        
        for(int i=2; i<=n; i++) if(i>=4) dp[i] = dp[i-2]% 10007 + dp[i-3]% 10007;
        
        System.out.println(dp[n] % 10007);
    }
}