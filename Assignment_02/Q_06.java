package Assignment_02;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        double t=sc.nextDouble();
        System.out.println("Distance traveled: "+((1/2)*32.174*Math.pow(t, 2)));
    }
    
}
