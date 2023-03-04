package Added_Question;

//Write a java program to  find minimum number of currency notes and values that sum to given amount Eg:  input: 2020 INR

import java.util.Scanner;

public class Q_17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int a=sc.nextInt();

        int b=a/2000;
        a=a%2000;
        int c=a/500;
        a=a%500;
        int d=a/100;
        a=a%100;
        int e=a/50;
        a=a%50;
        int f=a/20;
        a=a%20;
        int g=a/10;
        a=a%10;
        int h=a/5;
        a=a%5;
        int i=a/2;
        a=a%2;
        int j=a/1;
        a=a%1;
        System.out.println("Notes required "+(b+c+d+e+f+g+h+i+j));

    }
    
}
