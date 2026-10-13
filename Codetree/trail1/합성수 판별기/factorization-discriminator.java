import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean composite = false;
        for(int i=2; i<=N-1; i++){
            if(N%i == 0){
                composite = true;
                break;
            }
        }

        System.out.printf("%s", composite ? "C" : "N");
    }
}