package Assignment_04;

import java.util.Scanner;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the maximum number: ");int n=sc.nextInt();

        int i=1;int power=0;
        while(Math.pow(3,i)<=n){
            power=(int)Math.pow(3,i);
            i++;
        }
        System.out.println("The maximum power of 3 up to "+n+" is "+ power);
    }
    
}
