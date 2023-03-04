package Assignment_06;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Q_10 {
 public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Input the values: ");
    System.out.print("Height: ");int h=sc.nextInt();
    System.out.print("Base: ");int b=sc.nextInt();
    System.out.print("Side 1: ");int s1=sc.nextInt();
    System.out.print("Side 2: ");double s2=sc.nextInt();
    System.out.print("Radius: ");double r=sc.nextDouble();

    System.out.println("Area of triangle: "+area(b, h));
    System.out.println("Area of square: "+area(s1));
    System.out.println("Area of Circle: "+area(r));
    System.out.println("Area of rectangle: "+area(b, h));

 }  
 
 public static double area(int h,int b){
    double area=1/5*b*h;
    return area;
 }

 public static double area(int s){
    double area=Math.pow(s, 2);
    return area;
 }

 public static double area(double r){
    double area=Math.PI*Math.pow(r, 2);
    return area;
 }

 public static double area(int b,double h){
    double area=b*h;
    return area;
 }


}
