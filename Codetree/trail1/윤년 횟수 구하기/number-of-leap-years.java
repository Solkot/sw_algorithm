import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = N;
        for(int i=1; i<=N; i++){
            if(i % 4 != 0 || (i % 100 == 0 && i % 400 != 0)) cnt--;
        }
        System.out.println(cnt);
    }
}