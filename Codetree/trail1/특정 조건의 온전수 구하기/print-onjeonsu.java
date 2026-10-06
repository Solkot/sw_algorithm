import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for(int i=1; i<=N; i++){
            if(!(i%2==0 || i%10 == 5 || (i % 3 == 0 && !(i%9==0)))) sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}