package Assignment_06;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;
public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        if(isPallindrome(n)==false){
            System.out.println("The number "+n+" is not a pallindrome");
        }else{
            System.out.println("The number "+n+" is pallindrome");
        }
    }
    public static int reverse(int n){
        int div;int sum=0;
        for (int i = 1; i <=n; i++) {
            div =n%10;
            sum=sum*10+div;
            n=n/10;
        }
        return sum;
    }
    public static boolean isPallindrome(int n){
        int sum = reverse(n);
        boolean a = sum==n;
        return a;
    }
    
}
