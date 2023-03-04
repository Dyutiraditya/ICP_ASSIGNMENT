package Added_Question;

//WAM that takes the integer as an CLA to return through if the integer is palindrome
public class Q_01 {
    public static void main(String[] args) {
        int n =Integer.parseInt(args[0]);
        if(palindrone(n)==n){
            System.out.println(n+" has its palindrome");
        }else{
            System.out.println(n+" doesn't have its palindrome");
        }
    }
    public static int palindrone(int n){
        int sum=0;int r;
        for (int i = 1; i <=n; i++) {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    
    
}
