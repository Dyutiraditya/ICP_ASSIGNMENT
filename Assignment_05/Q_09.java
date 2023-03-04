package Assignment_05;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");int n=sc.nextInt();

        int sum=0;
        for (int i = 1; i <=n; i++) {
            sum=sum+(1/(int)Math.pow(i, 2));
        }
        System.out.println("The answer is "+sum);
    }
    
}
