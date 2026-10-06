import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for(int i=0; i<N; i++) sum += sc.nextInt();
        System.out.printf("%d %.1f", sum, sum * 1.0 / N);
    }
}