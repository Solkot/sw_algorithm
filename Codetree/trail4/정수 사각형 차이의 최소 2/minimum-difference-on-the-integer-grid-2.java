import java.util.Scanner;
import java.util.TreeSet;
import java.util.ArrayList;

public class Main {
    static int[] dx = {0, 1};
    static int[] dy = {1, 0};
    
    static int n;
    static int[][] matrix;
    static ArrayList<Integer> nums;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        matrix = new int[n][n];

        TreeSet<Integer> numSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                numSet.add(matrix[i][j]);
            }
        }

        nums = new ArrayList<>(numSet);

        int answer = binarySearch();
        System.out.println(answer);
    }

    public static int binarySearch() {
        int left = 0;
        int right = 2000;
        int answer = right;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (check(mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static boolean check(int diff) {
        for (int min : nums) {
            int max = min + diff;

            if (matrix[0][0] < min || matrix[0][0] > max) continue;
            if (matrix[n - 1][n - 1] < min || matrix[n - 1][n - 1] > max) continue;

            boolean[][] dp = new boolean[n][n];
            dp[0][0] = true;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!dp[i][j]) continue;

                    for (int k = 0; k < 2; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx < n && ny < n) {
                            if (matrix[nx][ny] >= min && matrix[nx][ny] <= max) {
                                dp[nx][ny] = true;
                            }
                        }
                    }
                }
            }
            if (dp[n - 1][n - 1]) return true;
        }
        return false;
    }
}