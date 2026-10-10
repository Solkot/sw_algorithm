import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        while(true){
            int temp = sc.nextInt();
            if(temp == 1) System.out.println("John");
            else if(temp == 2) System.out.println("Tom");
            else if(temp == 3) System.out.println("Paul");
            else if(temp == 4) System.out.println("Sam");
            else {System.out.println("Vacancy"); break;}
            
        }
    }
}