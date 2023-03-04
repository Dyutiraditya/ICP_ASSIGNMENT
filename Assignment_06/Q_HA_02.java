package Assignment_06;

import java.util.Scanner;

import javax.xml.transform.Source;

public class Q_HA_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the side: ");int s=sc.nextInt();
        System.out.print("Enter th radius: ");double r=sc.nextDouble();
        System.out.print("Enter the breadth: ");int b=sc.nextInt();
        System.out.print("Enter the height: ");int h=sc.nextInt();

        System.out.println("The volume of cube: "+volume(s)+"\nThe Volume of sphere: "+volume(r)+"\nThe Volume of cuboid: "+volume(s, b, h));

    }

    public static double volume(double r){
        return 4/3*Math.PI*Math.pow(r, 3);
    }

    public static double volume(int s){
        return Math.pow(s, 3);
    }

    public static double volume(int s,int b,int h){
        return s*b*h;
    }
    
}
