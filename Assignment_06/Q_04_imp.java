package Assignment_06;

import java.util.Scanner;

public class Q_04_imp {
    public static void main(String[] args) {
      //  Scanner sc =new Scanner(System.in);
      int sum=0;
        for (int i = 2000; i <=2020; i++) {
            sum=sum+numberOfDaysInAYear(i);
        }
        System.out.println("Total number of days between 2000 and 2020 is "+sum);
        for (int i = 2000; i <=2020; i++) {
            System.out.println("Number of days in "+i+" is "+numberOfDaysInAYear(i));
        }

    }
    public static int numberOfDaysInAYear(int i){
        int year;
        if(i%4==0 && i%400==0 && i%100!=0){
            year=366;
        }else{
            year=365;
        }
        return year;
    }
}
