package Assignment_06;

import java.util.Scanner;

public class Q_07_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the word: ");String s =sc.next();
        System.out.println("The number of vowels in word "+s+" is "+count(s));
    }
    public static int count(String s){
        int count =0;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    
}
