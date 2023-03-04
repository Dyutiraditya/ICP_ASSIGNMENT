package Assignment_04;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        System.out.print("Enter third number: ");int c=sc.nextInt();

        System.out.println("The series is as follows: ");
        for (int i = a; i <=b; a=a+c,i++) {
            System.out.print(a+" ");
        }
    }  
    
}
