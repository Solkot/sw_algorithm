import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = sc.nextInt();
        for(int i=N; i<=100; i++){
            String grade = "F";
            if(i >= 90) grade = "A";
            else if(i >= 80) grade = "B";
            else if(i >= 70) grade = "C";
            else if(i >= 60) grade = "D";  

            sb.append(grade).append(" ");
        }
        System.out.println(sb);
    }
}