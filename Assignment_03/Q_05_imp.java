package Assignment_03;

import java.util.Scanner;

public class Q_05_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Input the year: ");int i=sc.nextInt();
        if(i%4==0&&i%400==0||i%100!=0){
            System.out.println(i+" is a leap year");
        }else{
            System.out.println(i+" is not a leap year ");
        }
    }
    
}
