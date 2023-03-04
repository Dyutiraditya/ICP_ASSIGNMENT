package Assignment_02;

import java.util.Scanner;

public class Q_HA_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1=sc.nextDouble();double y1=sc.nextDouble();
        double x2=sc.nextDouble();double y2=sc.nextDouble();
        double x3=sc.nextDouble();double y3=sc.nextDouble();
        
        double side1=Math.pow(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2),1/2);
        double side2=Math.pow(Math.pow(x3-x2, 2)+Math.pow(y3-y2, 2),1/2);
        double side3=Math.pow(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2),1/2);

        double s=(side1+side2+side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3),1/2);
        
        System.out.println("The area of the triangle is "+area);
    }
    
}
