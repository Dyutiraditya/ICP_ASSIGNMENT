package MidSemester;

import java.util.Scanner;

public class Q_5_b_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(prime(i)&&prime(n-i)){
                System.out.println(n+" can be written as sum of "+i+" and "+(n-i));
                break;
            }
        }

    }
    public static boolean prime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
