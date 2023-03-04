package Assignment_04;

public class Q_HA_02 {
    public static void main(String[] args) {
        int sum=0;
        for (int i = 1; i <=1000; i++) {
            if(i%3==0||i%5==0){
                sum=sum+i;
            }
        }
        System.out.println("The sum of all number between 1 and 1000 which is either divisible by 3 or 5 is "+sum);
    }
    
}
