import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int divisor = 1;
        int cnt = 0;
        while(true){
            N /= divisor;
            divisor++;
            cnt++;
            if(N <= 1){System.out.println(cnt); break;}
        }
        
    }
}