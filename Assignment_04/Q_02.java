package Assignment_04;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();
        int a=n;
       int rem;int sum=0;
        while(n!=0){
            rem=n%10;sum=sum+rem;
            n=n/10;
        }
        if(sum%9==0){
            System.out.print(a+" is divisible by 9");
        }else{
            System.out.print(a+" is not divisible by 9");
        }
    }
    
}
