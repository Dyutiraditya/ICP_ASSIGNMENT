package Assignment_02;

public class Q_07 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a,b)");
        int a=1,b=2;
        for (int i = 1; i <=5; i++) {
            System.out.println(a+"\t"+b+"\t"+(int)Math.pow(a, b));
            a++;b++;
        }
    }
    
}
