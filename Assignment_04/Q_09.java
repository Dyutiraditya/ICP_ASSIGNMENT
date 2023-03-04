package Assignment_04;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();

        int rem;int sum=0;int  pow=1;
        for (int i = 1; i <=n; i++) {
            rem=n%10;
            if(rem!=0){
                sum=(int)sum+(rem*pow);
                pow=pow*10;
            }
        }
        System.out.println("The new number is "+sum);
    }
    
}
