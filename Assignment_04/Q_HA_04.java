package Assignment_04;

import java.util.Scanner;

public class Q_HA_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int n =sc.nextInt();

        int sum=0;int product=1;
        for (int i = 0; i <=n; i++) {
            if(i%2==0){
                sum=sum+i;
            }else{
                product=product*i;
            }
        }
        System.out.println("Sum of all even number between 1 and "+n+" is "+sum);
        System.out.println("Product of all integer between 1 and "+n+" is "+product);
    }
    
}
