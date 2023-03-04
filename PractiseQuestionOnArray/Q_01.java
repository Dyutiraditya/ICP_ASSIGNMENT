package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");int n =sc.nextInt();
        int[] a=new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*(n-1)+1);
            System.out.print(a[i]+" ");
        }
        System.out.println();
        
        int sum=0;
        for (int i = 0; i < a.length; i++) {
            sum=sum+a[i];
        }
        System.out.println("The sum of the elements in array is: "+sum+"\nThe average of the elements is: "+(sum/n));
        
    }
    
}
