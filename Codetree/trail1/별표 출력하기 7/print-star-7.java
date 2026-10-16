import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();

        int k = 0;
        for(int i=0; i<N; i++){
          for(int j=0; j<=i; j++){
            sb.append("* ");
          }
          sb.append("\n");
        }
        System.out.println(sb);
    }
}