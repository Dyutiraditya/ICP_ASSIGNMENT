package Added_Question;

public class Q_14 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j =1 ; j <i; j++) {
                System.out.print(5-(5-j+1)+1);
            }
             for (int j = 1; j <5-i+1; j++) {
                 System.out.print(5+" ");
             }
            System.out.println();
        }
    }
    
}