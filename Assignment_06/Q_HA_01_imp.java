package Assignment_06;

import java.util.Scanner;

public class Q_HA_01_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the String: ");String s=sc.nextLine();
        System.out.println("The number of unique character in the string "+s+" is "+uniqueCharacter(s));
    }

    public static char uniqueCharacter(String a){
        boolean b=true;
        for (int i = 0; i <a.length(); i++) {
            for (int j = 0; j <a.length(); j++) {
                if(i!=j&&a.charAt(i)==a.charAt(j)){
                    b=false;
                }
                if(b){
                    return a.charAt(i);
                }
            }
            
        }
        return ' ';
    
    
    }

    
}