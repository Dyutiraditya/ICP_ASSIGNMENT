package MidSemester;

public class Q_2_b {
    public static void main(String[] args) {
        System.out.println("A\tB\tpow(A,B)");
        int A=3;int B=1;
        for (int i = 1; i <5; i++) {
            System.out.println(A+"\t"+B+"\t"+(int)Math.pow(A, B));
            A=A+2;B=B+1;
        }
    }
}
