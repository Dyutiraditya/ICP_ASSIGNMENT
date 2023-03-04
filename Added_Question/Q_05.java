package Added_Question;

import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

//WAM to find three number are consecutive or not
public class Q_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first number: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        System.out.print("Enter third number: ");int c=sc.nextInt();
        if(consecutive(a, b, c)||consecutive(c, b, a)){
            System.out.println(a+" "+b+" "+c+" are consecutive");
        }else{
            System.out.println(a+" "+b+" "+c+" are not consecutive");
        }
    }
    public static boolean consecutive(int a,int b,int c){
        if(a<b&&b<c){
            if(b-a==1&&c-b==1){
                return true;
            }
        }
        return false;
    }
    
}
