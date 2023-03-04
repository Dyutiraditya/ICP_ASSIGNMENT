package Assignment_03;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        System.out.print("Enter third number: ");int c=sc.nextInt();

        if(a>b&&b>c){
            System.out.println("Increasing");
        }else if(a<b&&b<c){
            System.out.println("Decreasing");
        }else{
            System.out.println("Not increasing not decreasing");
        }
    }
    
}
