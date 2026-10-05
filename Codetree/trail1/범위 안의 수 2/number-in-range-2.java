import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int cnt=0;
        int sum=0;

        for(int i=0; i<10; i++){
            int temp = sc.nextInt();
            if(temp >=0 && temp<=200){
                sum+= temp;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, sum*1.0/cnt);
    }
}