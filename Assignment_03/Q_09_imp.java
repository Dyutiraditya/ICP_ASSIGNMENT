package Assignment_03;

import java.util.Scanner;

public class Q_09_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        System.out.print("Enter third number: ");int c=sc.nextInt();
        if(a>b&&a>c){
            if(b>c){
                System.out.println(a+" is the largest\n"+b+" is the second largest\n"+c+" is the smallest");
            }else{
                System.out.println(a+" is the largest\n"+c+" is the second largest\n"+b+" is the smallest");
            }
        }else if(b>a&&b>c){
            if(a>c){
                System.out.println(b+" is the largest\n"+a+" is the second largest\n"+c+" is the smallest");
            }else{
                System.out.println(b+" is the largest\n"+c+" is the second largest\n"+a+" is the smallest");
            }
        }else{
            if(a>b){
                System.out.println(c+" is the largest\n"+a+" is the second largest\n"+b+" is the smallest");
            }else{
                System.out.println(c+" is the largest\n"+b+" is the second largest\n"+a+" is the smallest");
            }
        }
    }
    
}
