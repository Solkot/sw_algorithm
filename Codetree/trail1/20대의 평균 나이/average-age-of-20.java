import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int cnt = 0;
        while(true){
            int age = sc.nextInt();
            if(age < 20 || age > 29) break;
            sum += age;
            cnt++;
        }
        System.out.printf("%.2f", sum * 1.0 / cnt);
    }
}