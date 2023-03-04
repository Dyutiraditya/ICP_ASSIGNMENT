package Assignment_02_CLA;

public class Q_HA_02 {
    public static void main(String[] args) {
        int r=Integer.parseInt(args[0]);
        int h=Integer.parseInt(args[1]);

        System.out.print("Surface area "+(Math.PI*Math.pow(r, 2)+2*Math.PI*r*h));
    }
    
}
