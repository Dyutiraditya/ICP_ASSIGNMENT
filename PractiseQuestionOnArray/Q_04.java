package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      double[] a=new double[10];
      System.out.print("Enter ten numbers: ");
      for (int i = 0; i < a.length; i++) {
        a[i]=sc.nextDouble();
      }
      System.out.print("The minimum number is: "+min(a));
    }

    public static double min(double[] array){
        double min=array[0];
        for (int i = 1; i < array.length; i++) {
            if(min>array[i]){
                min=array[i];
            }
        }
        return min;
    }
    
}
