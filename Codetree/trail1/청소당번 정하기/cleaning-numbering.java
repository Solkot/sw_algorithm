import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int cl = 0;
        int floor = 0;
        int toilet = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            if(i % 12 == 0) toilet++;
            else if(i%3==0) floor++;
            else if(i%2==0) cl++;
        }
        System.out.printf("%d %d %d", cl, floor, toilet);
    }
}