import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while(true){
            int temp = sc.nextInt();
            if(temp == 25){System.out.println("Good"); break;}
            if(temp < 25) System.out.println("Higher");
            if(temp > 25) System.out.println("Lower");
        }
    }
}