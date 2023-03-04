package Assignment_02;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); 
        System.out.print("Enter a number from 0 to 1000: ");
        int n =sc.nextInt();
        int remainder,sum=0;

        if(n>1000&&n<0){
            System.out.println("Error input");
        }else{
            for (int i = 1; i <=n; i++) {
                remainder=n%10;
                sum=sum+remainder;
                n=n/10;
            }
            System.out.println("The sum of digits is "+sum);
        }
    }
    
}
