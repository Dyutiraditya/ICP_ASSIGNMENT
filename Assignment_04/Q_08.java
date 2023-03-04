package Assignment_04;

import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int comp=(int)(Math.random()*(9)+1);
        int user;
        do{
            user =sc.nextInt();
            if(user>comp){
                System.out.println("Too high");
            }else if(user<comp){
                System.out.println("Too low");
            }else{
                System.out.println("Good guess");
            }
        }while(user!=comp);
    }
    
}
