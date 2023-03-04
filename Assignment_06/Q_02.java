package Assignment_06;

public class Q_02 {
    public static void main(String[] args) {

        for (int n = 1; n <=100; n++) {
            if(n%10!=0){
            int r =getPentagonalNumber(n);
            System.out.print(r+", ");}
                else{System.out.println();}
        }

    }
    static int getPentagonalNumber(int n){
        int r =(n*(3*n)-1)/2;
        return r;
        }
    
}
