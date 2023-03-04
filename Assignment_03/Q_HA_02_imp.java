package Assignment_03;

import java.util.Scanner;

public class Q_HA_02_imp {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.print("Enter the number: ");
        int days=sc.nextInt();

        switch(days){
            case 1:System.out.println("Monday");break;
            case 2:System.out.println("Tuesday");break;
            case 3:System.out.println("Wednesday");break;
            case 4:System.out.println("Thursday");break;
            case 5:System.out.println("Friday");break;
            case 6:System.out.println("Saturday");break;
            case 7:System.out.println("Sunday");break;
            default:System.out.println("Error");
        }

        int elapsed =sc.nextInt();
        int future =(days+elapsed)%7;
        String day=" ";
        switch(future){
            case 0:System.out.println("Today is %S and the future is Sunday");
        }
    }
    
}
