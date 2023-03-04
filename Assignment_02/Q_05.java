package Assignment_02;

import java.util.Scanner;

public class Q_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius of the hemisphere: ");
        double radius = sc.nextDouble();
        double surfaceArea=3*Math.PI*Math.pow(radius, 2);
        double volume=(2/3)*Math.PI*Math.pow(radius, 3);
        System.out.println("The surface area of the hemisphere is "+surfaceArea+"\nThe volume area of the hemisphere is "+volume);
    }
    
}
