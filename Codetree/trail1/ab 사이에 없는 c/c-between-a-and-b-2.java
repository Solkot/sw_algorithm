import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        boolean isFalse = true;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        for(int i=a; i<=b ; i++){
            if(i % c == 0){
                isFalse = false;
                break;
            }
        }

        System.out.printf("%s", isFalse ? "YES" :  "NO");
    }
}