package ImportantQuestionForICPLab;

import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the word: ");String s=sc.next();
        String s1=s.toUpperCase();
        int a;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)=='A'||s1.charAt(i)=='E'||s1.charAt(i)=='I'||s1.charAt(i)=='O'||s1.charAt(i)=='U'){
                a=i;
                break;
            }
        }
        //String piglatin=s1-s1.charAt(a-1)-s1.charAt(a-2);
    }
    
}
