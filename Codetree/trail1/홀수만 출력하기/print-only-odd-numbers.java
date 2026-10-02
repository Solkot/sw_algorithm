import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int t = sc.nextInt();
            if(t % 2 == 1 && t % 3 == 0) System.out.println(t);
        }
        
    }
}