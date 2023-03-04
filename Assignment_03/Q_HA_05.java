package Assignment_03;

import java.util.Scanner;

import javax.xml.transform.SourceLocator;

public class Q_HA_05 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("What is your gender (M or F): "); char gender =sc.next().charAt(0);
        System.out.print("First name: "); String firstName=sc.next();
        System.out.print("Last name: "); String lastName=sc.next();
        System.out.print("Age: ");int age=sc.nextInt();
        System.out.println("Are you married, Gita (y or n)?  ");char marriage =sc.next().charAt(0);
        if(gender=='m'||gender=='M'&&marriage=='y'||marriage=='Y'){
            System.out.println("Then I shall call you Mr."+firstName+" "+lastName);
        }else if(gender=='m'||gender=='M'&&marriage=='n'||marriage=='N'){
            System.out.println("Then I shall call you Mr."+firstName+" "+lastName);
        }else if(gender=='f'||gender=='F'&&marriage=='y'||marriage=='Y'){
            System.out.println("Then I shall call you Mrs."+firstName+" "+lastName);
        }else if(gender=='f'||gender=='F'&&marriage=='n'||marriage=='N'){
            System.out.println("Then I shall call you Miss."+firstName+" "+lastName);
        }else{
            System.out.println("Error");
        }

    }
    
}
