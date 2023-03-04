package Assignment_06;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number of sides: ");int n=sc.nextInt();
        System.out.print("Enter side length: ");double s=sc.nextDouble();
        System.out.println("The area of the polygon having "+n+" number of sides and of "+s+" length is "+area(n, s));
    }
    public static double area(int n,double s){
       double angle =Math.toRadians(Math.PI/n);
       double area =(n*Math.pow(s, 2))/(4*Math.tan(angle));
        return area;
    }
}
