package Assignment_02_CLA;

public class Q_05 {
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        
        int max_1=Math.max(a, b);int max_2=Math.max(max_1, c);
        int min_1=Math.max(a, b);int min_2=Math.min(min_1, c);
        int mid=(a+b+c)-(max_2+min_2);
        System.out.println(min_2+" "+mid+" "+max_2);
    }
    
}
