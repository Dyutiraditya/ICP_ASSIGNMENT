package Assignment_04;

import java.util.Scanner;

public class Q_05_imp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();

            int sum=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                sum=sum+i;
                System.out.print(sum+" ");
            }
        }
        System.out.println();
        if(sum==n){
            System.out.println(n+" is a perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
    }
    
}
