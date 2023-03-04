package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_06 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] a=new int[10];
        System.out.print("Enter ten number: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println("The second minimum number is: "+sec_small(a));
    }

    public static double sec_small(int[] array){
        int sec_small=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]!=min(array)&&sec_small>array[i]){
                sec_small=array[i];
            }
        }
        return sec_small;
    }

    public static double min(int[] array){
        double min =array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    
}
