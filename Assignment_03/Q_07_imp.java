package Assignment_03;

import java.util.Scanner;

public class Q_07_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("No. of units consumed: ");int n=sc.nextInt();

        double cost;
        if(n<=50){cost=3*n;}
        else if(n>50&&n<=200){cost=(50*3)+(4.80*n);}
        else if(n>200&&n<=400){cost=(50*3)+(150*4.8)+(5.80*n);}
        else{cost=(50*3)+(150*4.8)+(200*5.80)+(6.20*n);}

        System.out.print("Do you want to pay your bill online(y/n): ");char a=sc.next().charAt(0);

        double discount;
        switch(a){
            case 'Y':case 'y': discount=0.03*cost; break;
            case 'N':case 'n': discount=0;break;
            default: System.out.println("Enter wrong input");discount=0;cost=0;
        }

        System.out.println("Total amount: "+cost);
        System.out.println("Discount: "+discount);
        System.out.println("Amount payable: "+(cost-discount));
    }
}
