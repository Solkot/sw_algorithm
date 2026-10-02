import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int a = sc.nextInt();
        for(int i=1; i<=N; i++) sb.append(i%a==0 ? 1 : 0).append("\n");
        System.out.println(sb);
    }
}