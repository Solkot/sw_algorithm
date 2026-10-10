import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception{
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        while(true){
            int horizental = sc.nextInt();
            int vertical = sc.nextInt();
            String str = sc.next();
            System.out.println(horizental * vertical);
            if(str.equals("C")){
                break;
            }
        }
    }
}