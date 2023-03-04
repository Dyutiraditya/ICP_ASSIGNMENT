package Added_Question;
//WAM to print all the prime number between 1 to 500
public class Q_03_imp {
    public static void main(String[] args) {
        for (int i = 1; i <=500; i++) {
            if(prime(i)){
                System.out.print(i+" ");
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
