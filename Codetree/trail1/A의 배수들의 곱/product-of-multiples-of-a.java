import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = 1;

        for(int i=1; i<=B; i++) result *= i % A == 0 ? i : 1;

        System.out.println(result);
    }
}