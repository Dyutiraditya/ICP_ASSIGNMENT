package Added_Question;

//Write a program to print the following pattern
/* 1
 * 1 0
 * 1 0 1
 * 1 0 1 0
 * 1 0 1 0 1
 */

public class Q_09 {
    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                if(j%2!=0){
                    System.out.print(" "+1+" ");
                }else{
                    System.out.print(" "+0+" ");
                }
            }
            System.out.println();
        }
    }
    
}
