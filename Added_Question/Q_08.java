package Added_Question;

//Write a program to find the sum of following series using method 1-1/2+1/3-1/4+.............1/n
import java.util.Scanner;

public class Q_08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sum(n);
    }
        public static void sum(int n) {
        double sum=0;int pow=1;
        for (int i = 1; i <=n; i++) {
            sum=sum+(pow*(1.0/i));
            pow=pow*-1;
        }
        System.out.println();
        System.out.println(sum);
    }
    
}
