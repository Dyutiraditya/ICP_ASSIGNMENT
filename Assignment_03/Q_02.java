package Assignment_03;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Amount of water Alice is drinking: ");int x=sc.nextInt();
        String a =x>=5000?"Yes":"No";
        System.out.println(a+", Alice is following doctors advice");
    }
}
