package Assignment_05;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();
        int a=0,b=1,c=1,d;
        System.out.print("The sequence is "+a+", "+b+" ,"+c+", ");
        for (int i = 1; i <=n; i++) {
            d=a+b+c;
            a=b;b=c;c=d;
            System.out.print(d+", ");
        }
    }
}
