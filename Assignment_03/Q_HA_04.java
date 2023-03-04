package Assignment_03;

import java.util.Scanner;

public class Q_HA_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a=sc.nextInt();

        if(a%5==0&&a%6==0){
            System.out.println(a+" is divisible by 5 and 6");
        }else if(a%5==0||a%6==0){
            System.out.println(a+" is divisible by 5 or 6");
        }else if(a%(5*6)==0){
            System.out.println(a+" is divisible by 5 or 6 but not both");
        }else{
            System.out.println("Error");
        }
    }
    
}
