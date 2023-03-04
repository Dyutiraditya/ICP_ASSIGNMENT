package Assignment_05;

import java.util.Scanner;

public class Q_02_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");int n =sc.nextInt();
        int a=n;

        int sum=0;int sum_1=0;int sum_2=0;
        //Checking n is a prime number or not
        for (int i = 2; i <=n; i++) {
            if(n%i==0){
                sum=0;
            }else{
                sum++;
            }
        }

        int rem;
        //Twisting up (reversing)the number
        for (int i = 1; i <=n; i++) {
            rem=n%10;
            sum_1=sum_1*10+rem;
            n=n/10;
        }
        
        //Checking the twisted number as prime
        for (int i = 2; i <=sum_1; i++) {
            if(sum_1%i==0){
                sum_2=0;;
            }else{
                sum_2++;
            }
        }

        //Checking for twisted prime
        if(sum!=0 && sum_2!=0){
            System.out.println(a+" is a twisted prime number");
        }else{
            System.out.println(a+" is not a twisted prime number");
        }
    }
}
