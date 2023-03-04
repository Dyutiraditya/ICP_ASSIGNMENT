package Assignment_05;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");int n =sc.nextInt();

        int sum=0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                sum=sum+j;
            }
        }
        System.out.println("The answer is "+sum);
    }
    
}
