import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int result = 1;
        for(int i=0; i<5; i++){
            int temp = sc.nextInt();
            if(temp % 3 != 0){
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}