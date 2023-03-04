package MidSemester;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Q_5_c {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();int sum=0;
        for (int i = 1; i <=n; i++) {
        for (int j = 1; j <(n-i)+1; j++) {
            sum++;
            System.out.print(sum+" ");
            
        }
        System.out.println();
    }
    }
    
}
