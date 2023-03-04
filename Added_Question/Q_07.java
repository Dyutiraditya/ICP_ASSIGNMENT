package Added_Question;

//Write a programme to find all common prime divisors of two numbers using method
import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter first question: ");int a=sc.nextInt();
        System.out.print("Enter second number: ");int b=sc.nextInt();
        int x=(a<b)?a:b;
        for (int i = 1; i < x; i++) {
            if(isPrime(i)&&isDivisor(a, i)&&isDivisor(b, i)){
                System.out.print(i+" ");
            }
        }

    }

    public static boolean isPrime(int n){
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isDivisor(int n,int m){
       if(n%m==0){
        return true;
       }
       return false;
    }
    
}
