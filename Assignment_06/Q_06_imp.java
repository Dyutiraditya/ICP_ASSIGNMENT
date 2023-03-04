package Assignment_06;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Q_06_imp {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter the word: ");String s =sc.next();
        System.out.print("Enter the letter: ");char c =sc.next().charAt(0);
        System.out.println("The number of letter "+c+" in word "+s+" is "+count(s, c));

    }
    public static int count(String s,char c){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                count=count+1;
            }
        }
        return count;
    }
    
}
