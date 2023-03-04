package PractiseQuestionOnArray;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of array: ");int n=sc.nextInt();

        int[] a=new int[n];
         for(int value=0;value<a.length;value++){
             a[value]=1+(int)(Math.random()*(100-1)+1);
             System.out.print(a[value]+" ");
         }
        System.out.println();

        int count=0;
        for(int i=0; i<a.length; i++){
            if(isPrime(a[i])){
                System.out.print(a[i]+" ");
                count++;
            }
        }
        System.out.println();
       System.out.println("The number of prime number in the array is: "+count);
    }
    

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
