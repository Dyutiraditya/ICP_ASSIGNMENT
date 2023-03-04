package ImportantQuestionForICPLab;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number: ");int x=sc.nextInt();
        System.out.print("Enter the iteration: ");int n=sc.nextInt();
        int sum=1;
        for (int i = 1; i <=n ; i++) {
            sum=sum+((int)(Math.pow(x, i))/i);
        }
        System.out.println("Sum to e x= "+sum);
    }
    
}
