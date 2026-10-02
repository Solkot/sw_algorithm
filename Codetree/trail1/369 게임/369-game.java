import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        String N = sc.next();
        int n = Integer.parseInt(N);
        for(int i=1; i<=n; i++) sb.append(isCorrect(String.valueOf(i)) ? 0 : i).append(" ");

        System.out.println(sb);
    }

    static boolean isCorrect(String num){
        if(num.contains("3") || num.contains("6") || num.contains("9") || Integer.parseInt(num) % 3 == 0) return true;
        return false;
    }
}