import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        // 홀수 && 3의 배수
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            int temp = sc.nextInt();
            sum += temp % 2 == 1 && temp % 3 == 0 ? temp : 0;
        }
        System.out.println(sum);
    }
}