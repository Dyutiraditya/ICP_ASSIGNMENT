package Assignment_02;

import java.util.Scanner;

public class Q_HA_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the amount of eggs: ");int eggs=sc.nextInt();

        int gross=eggs/144;eggs=eggs%144;
        int dozen=eggs/12;int extra=eggs%12;
        System.out.print("Your number of eggs is "+gross+" gross, "+dozen+" dozen and "+extra+" extra.");
    }
    
}
