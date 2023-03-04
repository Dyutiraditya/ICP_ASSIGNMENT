package Added_Question;

import java.util.Scanner;

//WAM to count the number of vowels is a given string
public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a string: ");String a =sc.next();
        System.out.println("The number of vowels in string "+a+" is "+noOfVowels(a));
    }
    public static int noOfVowels(String a){
        int count=0;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U'){
                count++;
            }
        }
        return count;
    }
    
}
