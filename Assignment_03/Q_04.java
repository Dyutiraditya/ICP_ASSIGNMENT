package Assignment_03;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("User input: ");int n=sc.nextInt();
        int comp=(int)(Math.random()*(8)+1);
        System.out.println("Computer guess: "+comp);
        double i=comp-n;
        if(Math.abs(i)==1){
            System.out.println("Almost got it right");
        }else if(comp==n){
            System.out.println("You got it right");
        }else{
            System.out.println("You got it wrong");
        }
    }
    
}
