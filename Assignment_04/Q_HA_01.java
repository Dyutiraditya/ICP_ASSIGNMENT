package Assignment_04;

public class Q_HA_01 {
    public static void main(String[] args) {
        int sum_1=0;int sum_2=-0;
        for (int i = 1; i <=10; i++) {
            sum_1=sum_1+i;
            sum_2=sum_2+(int)Math.pow(i,2);
            System.out.print(sum_1+" + ");
            System.out.print(sum_2+" + ");
        }
        int sum=(int)Math.pow(sum_1,2);
        System.out.println();
        System.out.println("Hence the difference between th sum of the square of first ten natural number and the square of the sum is"+(sum-sum_2));
    }
    
}
