import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        for(int i=1; i<=N; i++) sb.append(i%2==0 || i%3==0 ? 1 : 0).append(" ");
        System.out.println(sb);
    }
}