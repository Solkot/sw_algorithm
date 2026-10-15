import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = N;

        for(int i=0; i<N; i++){
            for(int j=C--; j>=1; j--){
                System.out.printf("* ");
            }
            System.out.println();
        }
    }
}