package MidSemester;

import java.util.Scanner;

public class Q_5_a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();int sum=0;int rem;int pow=1;
        for (int i = 0; i <n; i++) {
            if(n%10!=0){
                rem=n%10;sum=sum+(pow*rem);
                pow=pow*10;
            }
            n=n/10;
        }
        System.out.println(sum);
    }
    
}
