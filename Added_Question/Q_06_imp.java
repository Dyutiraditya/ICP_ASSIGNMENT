package Added_Question;

import java.util.Scanner;
//WAM to print the prime factor of a number
public class Q_06_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number: ");int n=sc.nextInt();
        System.out.println("The prime factor of "+n+" is "+factor(n)+" that is");
        factor_1(n);
    }
    public static boolean prime(int n){
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int factor(int n){
        int factor=1;
        for (int i = 1; i <n; i++) {
            if(prime(i)){
            factor=factor*i;
            }
        }
        return factor;
    }
    public static void factor_1(int n){
        for (int i = 1; i <n; i++) {
            if(prime(i)){
            System.out.print(i+" ");
            }
        }
        
    }
    
}
