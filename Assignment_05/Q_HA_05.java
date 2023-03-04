package Assignment_05;

import java.util.Scanner;

public class Q_HA_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of iteration: ");int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print("The fibonacci series is as follows: "+a+" "+b+" ");
        for (int i = 0; i <=n; i++) {
            c=a+b;
            a=b;b=c;
            System.out.print(c+" ");
        }
    }
    
}
