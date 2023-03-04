package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }

        System.out.print("The second maximum number is: "+sec_max(a));
    }

    public static int sec_max(int[] array){
        int sec_max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]!=max(array)&&sec_max<array[i]){
                sec_max=array[i];
            }
        }
        return sec_max;
    }

    public static int max(int[] array){
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }
    
}
