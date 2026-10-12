import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int x = 0;
        int N = sc.nextInt();
        while(Math.pow(2, x) != N){
            x++;
        }
        System.out.println(x);
    }
}