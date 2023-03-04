package ImportantQuestionForICPLab;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");int n=sc.nextInt();
        String a=isSpyNumber(n)? " is spy number":" is not a spy number";
        System.out.println(n+a);

    }

    public static int sum(int n){
        int sum=0;int r;
        for (int i = 1; i <=n; i++) {
            r=n%10;
            sum+=r;
            n/=10;
        }
        return sum;
    }

    public static int product(int n){
        int product=1;int r;
        for (int i = 1; i <=n; i++) {
            r=n%10;
            product*=r;
            n/=10;
        }
        return product;
    }

    public static boolean isSpyNumber(int n){
        if(sum(n)==product(n)){
            return true;
        }
        return false;
    }
    
}
