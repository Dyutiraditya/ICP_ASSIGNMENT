package Assignment_06;

import java.util.Scanner;

public class Q_HA_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
            System.out.println("Enter the string: ");
            String s=sc.next();
            System.out.println("The mid of string is: "+mid(s));
        
    }

    public static char mid(String s){
        int mid;
        if(s.length()%2==0){
            mid=(s.length()+1)/2;
        }else{
            mid=s.length()/2;
        }
        return s.charAt(mid);
    }
    
}
