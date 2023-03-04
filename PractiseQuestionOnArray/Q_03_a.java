package PractiseQuestionOnArray;

import java.util.Scanner;
public class Q_03_a {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");int n=sc.nextInt();

        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        
        int count=0;
        for (int i = 1; i <=100; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i==a[j]){
                        count++;
                }
            }
            if(count!=0){
            System.out.print(i+" occurs "+count+((count>1)?" times":"time"));
            count=0;
            System.out.println();
            }
        }
        
    }
    
}

