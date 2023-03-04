package Assignment_02_CLA;

public class Q_01 {
    public static void main(String[] args) {
        int dividend=Integer.parseInt(args[0]);
        int divisor=Integer.parseInt(args[1]);

        int quotient =dividend/divisor;
        int remainder =dividend%divisor;
        System.out.print("Quotient is "+quotient+" and Remainder is "+remainder);
    }
    
}
