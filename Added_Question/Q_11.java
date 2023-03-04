package Added_Question;

//Write a programme to print the following pattern 
/*    1
     2 2
    3 3 3
   4 4 4 4
 */
public class Q_11 {
    public static void main(String[] args) {
        for (int i = 1; i <5; i++) {
            for (int j =1 ; j <=5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    
}
