package Assignment_06;

import java.util.Scanner;

public class Q_HA_04 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the sentence: ");
        String s =sc.nextLine();

        System.out.println("The number of words in the sentence "+s+" is: "+numberOfWords(s));
    }

    public static int numberOfWords(String s){
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)==' '){
                count++;
            }
        }
        return count+1;
    }
    
}
