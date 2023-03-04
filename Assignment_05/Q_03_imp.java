package Assignment_05;

import java.util.Scanner;

public class Q_03_imp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        
        System.out.println("The prime number between "+a+" and "+b+" are:");
        int sum=0;
        for (int i = a; i <=b; i++) {
            for (int j = 2; j <i; j++) {
                if(i%j==0){
                    sum=1;
                }
            }
            if(sum==0){
                System.out.print(i+" ");
            }
            sum=0;
        }
    }
    
}
