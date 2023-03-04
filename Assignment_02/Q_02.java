package Assignment_02;

import java.util.Scanner;

public class Q_02 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the distance in km=");
        int km=sc.nextInt();
        System.out.println(km +" km is "+(km*1000)+" meters\n"+km +" km is "+(km*3280.8399)+" feet\n"+km +" km is "+(km*39370.0787)+" inch\n"+km +" km is "+(km*100000)+" centimetres");

    }
    
}
