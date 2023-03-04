package MidSemester;

import java.util.Scanner;

public class Q_3_c {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two operand: ");
        int a=sc.nextInt();int b=sc.nextInt();
        char o=sc.next().charAt(0);

        switch(o){
            case'+': System.out.println("The addition of "+a+" and "+b+" is "+(a+b));break;
            case '-': System.out.println("The substraction of "+a+" and "+b+" is "+(a-b));break;
            case '*':System.out.println("The multiplication of "+a+" and "+b+" is "+(a*b));break;
            case '/':System.out.println("The division of "+a+" and "+b+" is "+(a/b));
            default:System.out.println("Input error");
        }
    }
}
