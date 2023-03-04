package Assignment_06;

import java.util.Scanner;

public class Q_08_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the word: ");String s =sc.next();
        if(isPalindrome(s)==false){
            System.out.println(s+" is not a palindrome");
        }else{
            System.out.println(s+" is a palindrome");
        }
    }
    public static boolean isPalindrome(String s){     
      boolean a=true;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==s.charAt(s.length()-(i+1))){
                a=true;
            }else{
                a=false;
            }
        }
        return a;
    }
    
}
