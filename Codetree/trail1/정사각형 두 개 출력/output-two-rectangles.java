import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        sb.append("\n");
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.printf(sb.toString());
    }
}