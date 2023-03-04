package Assignment_02;

import java.util.Scanner;

public class Q_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a Fahrenheit degree: ");
        double fahrenheit=sc.nextDouble();
        System.out.println(fahrenheit+" Fahrenheit is "+(fahrenheit-32)*(5/9)+" Celsius");
        
    }
}
