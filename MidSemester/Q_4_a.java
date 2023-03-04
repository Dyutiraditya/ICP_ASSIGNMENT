package MidSemester;

import java.util.Scanner;

public class Q_4_a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();int sum=0;int product =1;
        for (int i = 0; i <=n; i=i+2) {
            sum=sum+i;
        }
        System.out.println("The sum of all even integers between 1 and "+n+" is "+sum);
        for (int i = 1; i <=n; i=i+2) {
            product=product*i;
        }
        System.out.println("The product of all odd integers between i and "+n+" is "+product);
    }
    
}
