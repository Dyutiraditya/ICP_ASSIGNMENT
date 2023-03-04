package Assignment_04;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the number: ");int n =sc.nextInt();

        System.out.println("Multiplication table of "+n+" is:");
        for (int i = 1; i <=n; i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
    
}
