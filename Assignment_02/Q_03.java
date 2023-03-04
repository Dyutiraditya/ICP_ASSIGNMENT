package Assignment_02;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        int salary =sc.nextInt();
        System.out.println("DA is "+((40/100)*salary)+"\nHRA is "+((20/100)*salary)+"Gross salary is "+((salary)-((40/100)*salary)-((20/100)*salary)));
    }
    
}
