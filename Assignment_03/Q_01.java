package Assignment_03;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your age: ");int age=sc.nextInt();
        String a=age>=18?"You are eligible to cast vote":"You are not eligible to cast vote";
        System.out.println(a);
    }
}
