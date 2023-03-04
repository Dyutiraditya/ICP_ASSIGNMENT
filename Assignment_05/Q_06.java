package Assignment_05;

public class Q_06 {
    public static void main(String[] args) {
        int n=5;
        System.out.println("Pattern of a");
        for (int i = 1; i<=n ; i++) {
          for (int j = 1; j <=i; j++) {
            System.out.print(" *");
          }
        System.out.println();
         }

         System.out.println();
         System.out.println("Pattern of b");
         for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+i);
            }
            System.out.println();
         }

         System.out.println();
         System.out.println("Pattern of c");
         int sum=0;
         for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                sum=sum+1;
                System.out.print(" "+sum);
            }
            System.out.println();
         }

         System.out.println();
         System.out.println("Pattern of d");
         for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+j);
            }
            System.out.println();
         }
  }
}
