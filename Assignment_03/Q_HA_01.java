package Assignment_03;

import java.util.Scanner;

public class Q_HA_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your input: ");
        int input=sc.nextInt();
        int comp =(int)(Math.random()*(2));
        System.out.println("You choose "+RPS(input)+" and computer choose "+RPS(comp));
        if(input>comp&&Math.abs(input-comp)==1){
            System.out.println("You win");
        }else if(comp>input&&Math.abs(input-comp)==1){
            System.out.println("Computer win");
        }else{
            System.out.println("You win");
        }
    }

    public static String RPS(int a){
        String s;
        if(a==0){
            s="Scissor";
        }else if(a==1){
            s="Rock";
        }else if(a==2){
            s="Paper";
        }else{
            s="Not valid";
        }
        return s;
    }
    
}
