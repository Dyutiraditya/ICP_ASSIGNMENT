package Added_Question;
//WAM to find the twin prime number between 1 to 100
public class Q_04_imp {
    public static void main(String[] args) {
        for (int i = 1; i <=100; i++) {
            if(prime(i)&&prime(i+2)){
                    System.out.println(i+" and "+(i+2)+" are twin prime number");
            }
        }
    }
    public static boolean prime(int n){
        for (int i = 2; i <n; i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
}
