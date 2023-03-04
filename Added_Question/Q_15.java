package Added_Question;

//nth Prime
import java.util.Scanner;

public class Q_15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();int a=0;
        for (int i = 1; i <=n; i++) {
            if(isprime(i)){
                a=i;
            }
        }
        System.out.println(a);
        

    }

    public static boolean isprime(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
}
