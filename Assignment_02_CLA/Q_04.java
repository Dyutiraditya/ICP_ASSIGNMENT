package Assignment_02_CLA;

public class Q_04 {
    public static void main(String[] args) {
        double t=Double.parseDouble(args[0]);

        double radian=Math.toRadians(t);

        System.out.print(Math.cos(radian)+Math.sin(radian));
    }
    
}
