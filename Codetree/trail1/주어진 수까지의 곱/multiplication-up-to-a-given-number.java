import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 1;
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        for(int i=A; i<=B; i++){
            a *= i;
        }
        System.out.println(a);
    }
}