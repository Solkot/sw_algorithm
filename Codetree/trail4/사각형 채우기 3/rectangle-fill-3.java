import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        long[] dp = new long[1001];
        long[] sumfix = new long[1001];
        dp[0] = 1; sumfix[0] = 1;
        dp[1] = 2; sumfix[1] = 2 + sumfix[0];
        dp[2] = 7; sumfix[2] = 7 + sumfix[1];

        if(n>=3) for(int i=3; i<=n; i++) {
            dp[i] = (dp[i-1] * 2 + dp[i-2] * 3 + sumfix[i-3] * 2) % 1000000007;
            sumfix[i] = (dp[i] + sumfix[i-1]) % 1000000007;
        }
        System.out.println(dp[n]);
    }
}