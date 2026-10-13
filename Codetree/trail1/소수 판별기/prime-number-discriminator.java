import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean prime = true;
        for(int i=2; i<N; i++){
            if(N%i==0){
                prime = false;
                break;
            }
        }

        System.out.printf("%s", prime ? "P" : "C");
    }
}