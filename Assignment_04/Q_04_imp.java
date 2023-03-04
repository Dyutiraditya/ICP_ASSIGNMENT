package Assignment_04;

import java.util.Scanner;

public class Q_04_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter X: ");int x=sc.nextInt();
        System.out.print("Enter Y: ");int y =sc.nextInt();

        int r,a,b;
        a=(x>y)?x:y; b=(x<y)?x:y;
        r=b;
        while(a%b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        System.out.println("GCD of "+x+" and "+y+" is "+r);
    }
    
}
