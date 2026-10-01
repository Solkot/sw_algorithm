import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        if(A > 0) for(int i=0; i<B; i++) sb.append(A);
        else sb.append(0);
    
        System.out.println(sb);
    }
}