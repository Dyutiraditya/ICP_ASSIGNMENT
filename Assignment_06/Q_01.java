package Assignment_06;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Q_01{

    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a =sc.nextInt();
    System.out.print("Enter second number: ");
    int b =sc.nextInt();
    System.out.print("Enter the operation: ");
    char o =sc.next().charAt(0);
    System.out.println("............................................");
    
    switch(o){
        case '+': int r1 =add(a,b); System.out.println("Result= "+r1); break;
        case '-': int r2 =sub(a,b); System.out.println("Result= "+r2); break;
        case '*': int r3 =mul(a,b); System.out.println("Result= "+r3); break;
        case '/': int r4 =div(a,b); System.out.println("Result= "+r4); break;
        case '%': int r5 =rem(a,b); System.out.println("Result= "+r5); break;
        case '^': int r6 =sqrt(a); System.out.println("Result= "+r6); break;
        default: System.out.println("Input Error");
    }
    
        
    }
    static int add(int a,int b){
        int r1 =a+b;
        return r1;
    }
    static int sub(int a,int b){
        int r2 =a-b;
        return r2;
    }
    static int mul(int a,int b){
        int r3 =a*b;
        return r3;
    }
    static int div(int a,int b){
        int r4 =a/b;
        return r4;
    }
    static int rem(int a,int b){
        int r5 =a%b;
        return r5;
    }
    static int sqrt(int a){
        int r6=(int)Math.sqrt(a);
        return r6;
    }
}