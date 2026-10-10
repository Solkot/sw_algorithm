import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        while(true){
            int temp = sc.nextInt();
            if(temp % 2 == 1) continue;
            else{
                System.out.println(temp / 2);
                cnt++;
                if(cnt >= 3) break;
            }
            
        }
    }
}