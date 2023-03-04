package Assignment_06;

import java.util.Scanner;
import java.util.Spliterator.OfPrimitive;

public class Q_09 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your password here: ");String password=sc.next();
        if(onlyCharactersAndDigits(password)&&eightCharacters(password)&&atLeastTwoDigits(password)){
            System.out.println("Valid password");
        }else{
            System.out.println("Invalid password");
        }

    }

    public static boolean eightCharacters(String s){
        if(s.length()>8){
            return true;
        }
        return false;
    }

    public static boolean atLeastTwoDigits(String s){
        int count=0;
        for (int i = 0; i <s.length(); i++) {
            if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57){
                count++;
            }
        }
        if(count>=2){
            return true;
        }else{
            return false;
        }

    }

    public static boolean onlyCharactersAndDigits(String s){
        for (int i = 0; i <s.length(); i++) {
            if((int)s.charAt(i)>=48&&(int)s.charAt(i)<=57&&(int)s.charAt(i)>=65&&(int)s.charAt(i)<=90&&(int)s.charAt(i)>=97&&(int)s.charAt(i)<=122){
                return true;
            }
        }
        return false;
    }
}
