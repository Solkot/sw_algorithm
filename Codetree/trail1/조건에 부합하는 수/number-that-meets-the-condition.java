import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int A = sc.nextInt();

        for(int i=1; i<=A; i++){
            if(!(i % 2 == 0 && !(i%4==0) || (int)(i / 8) % 2 == 0 || i % 7 < 4)) sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}