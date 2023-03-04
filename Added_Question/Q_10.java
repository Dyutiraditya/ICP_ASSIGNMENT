package Added_Question;

//Print the following pattern
/* **********
    ********
     ******
      ****
       **
 */
public class Q_10 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=10-(2*i)+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
