package Assignment_05;

import java.util.Scanner;

public class Q_HA_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");double n=sc.nextDouble();
        double t= 1,sum=0;
        int i=0;
        do{
            sum=sum+t;
            i=i+2;
            t=-t*n*n/(i*(i-1));
        }while(Math.abs(t)>(10^-6));
        System.out.println("The answer is: "+sum);
    
    }
    
}
