import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int high = Math.max(A, B);
        int low = Math.min(A, B);

        StringBuilder sb = new StringBuilder();

        for(int i=high; i>=low; i--) sb.append(i).append(" ");
    
        System.out.println(sb);
    }
}