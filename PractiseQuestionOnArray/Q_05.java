package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] a=new int[5];
        System.out.print("Enter five numbers: ");
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
       
        System.out.println("The maximum number is: "+max(a));
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
