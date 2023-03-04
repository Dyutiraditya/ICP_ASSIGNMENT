package Added_Question;

import java.util.Scanner;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();int b=sc.nextInt();int c=sc.nextInt();
        if( MiddlePoint(a, b, c)&&((a+c)/2)==b){
        System.out.println("True");
       }else{
        System.out.println("False");
       }

    }

    public static boolean MiddlePoint(int n1,int n2,int n3){
        int max=Math.max(n1, n2);int max1=Math.max(max, n3);
        int min=Math.min(n1, n2);int min2=Math.min(min, n3);
        int mid=(n1+n2+n3)-(max1+min2);
        if(mid==n2){
            return true;
        }
        return false;
    }
    
}
