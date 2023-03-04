package Assignment_02_CLA;

public class Q_HA_03 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);

        int lastDigit=n%10;
        int firstDigit=0;
        for (int i = 1; i <=n; i++) {
            firstDigit=n%10;
            n=n/10;
        }
        System.out.println(lastDigit+firstDigit);
    }
    
}
