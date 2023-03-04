package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");int n=sc.nextInt();

        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        
        int count=1;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i!=j){
                    if(a[i]==a[j]){
                        count++;
                    }
                }
            }
            System.out.print(a[i]+" occurs "+count+((count>1)?" times":"time"));
            count=1;
            System.out.println();
        }
        
    }
    
}
