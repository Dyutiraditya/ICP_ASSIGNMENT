package Assignment_05;

import java.util.Scanner;

public class Q_04_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();

        int product=1;
        for (int i = 1; i <=n; i++) {
            product=product*i;
        }
        System.out.println("The factorial of "+n+" is "+product);
    }
}
