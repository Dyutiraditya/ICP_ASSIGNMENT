package Assignment_02_CLA;

public class Q_HA_01 {
    public static void main(String[] args) {
        int principal=Integer.parseInt(args[0]);
        int rate=Integer.parseInt(args[1]);
        int time=Integer.parseInt(args[2]);

        System.out.print("Simple Interest "+((principal*rate*time)/100));
    }
    
}
