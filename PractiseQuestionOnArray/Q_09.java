package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of the array: ");int n=sc.nextInt();
        int[] a=new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter the number to find: ");int b=sc.nextInt();
        if(lsearch(a, b)!=-1){
        System.out.println("The element is present in array in position: "+lsearch(a, b));
        }

    }

    public static int lsearch(int[] array,int n){
        
        for (int i = 0; i < array.length; i++) {
            if(array[i]==n){
                return i+1;
            }
    }
    return -1;
    
}
}
