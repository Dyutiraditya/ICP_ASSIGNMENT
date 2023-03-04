package Assignment_04;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n =sc.nextInt();

        int random;int sum=0;int i=1;
        do{
            random=(int)(Math.random()*(n-1)+1);
            System.out.print(random+" ");
            sum=sum+random;
            i++;
        }while(i<=n);
        System.out.println();
        System.out.println("The average of "+n+" numbers is "+(sum/n));
    }
    
}
