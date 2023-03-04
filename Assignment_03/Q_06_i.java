package Assignment_03;

import java.util.Scanner;

public class Q_06_i {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter th units consumed: ");int n=sc.nextInt();

        double cost;
        if(n<=50){cost=3*n;}
        else if(n>50&&n<=200){cost=(50*3)+(4.80*n);}
        else if(n>200&&n<=400){cost=(50*3)+(150*4.8)+(5.80*n);}
        else{cost=(50*3)+(150*4.8)+(200*5.80)+(6.20*n);}

        System.out.println("You will be charges Rs."+cost+" for your usage of "+n+"units");
    }
    
}
