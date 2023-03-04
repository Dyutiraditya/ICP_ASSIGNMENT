package Assignment_04;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the base: ");int a=sc.nextInt();
        System.out.print("Enter the power: ");int b=sc.nextInt();

        int power=(int)Math.pow(a, b);
        System.out.println(a+" to the power "+b+" is "+power);
    }
    
}
