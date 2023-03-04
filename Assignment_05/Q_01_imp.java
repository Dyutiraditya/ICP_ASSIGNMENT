package Assignment_05;

import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class Q_01_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();

        int sum_a=0;int sum_b=0;
        for (int i = 1;i<=a; i++) {
            if(a%i==0){
                sum_a=sum_a+i;
            }
        }
        for (int i = 1; i <=b; i++) {
            if(b%i==0){
                sum_b=sum_b+i;
            }
        }

        if(sum_a==sum_b){
            System.out.println(a+" and "+b+" are amicable");
        }else{
            System.out.println(a+" and "+b+" are not amicable");
        }
    }
    
}
