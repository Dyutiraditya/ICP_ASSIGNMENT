package Added_Question;

public class Q_16 {
    public static void main(String[] args) {
        int n=(int)(Math.random()*(1000-1)+1);
        System.out.println(n);
        int b=b(n);
       for (int i = 1; i <b; i++) {
           int ones=b%10;
           String one=toWords(ones);
           System.out.print(one);
            b=b/10;
       }
    }

    public static String toWords(int n){
        String one;
        switch(n){
            case 1:one=" One ";break;
            case 2:one=" Two ";break;
            case 3:one=" Three ";break;
            case 4:one=" Four ";break;
            case 5:one=" Five ";break;
            case 6:one=" Six ";break;
            case 7:one=" Seven ";break;
            case 8:one=" Eight ";break;
            case 9:one=" Nine";break;
            default:one="Zero";
        }
        return one;
    }

    public static int b(int n){
        int b=0,r;
        for (int i = 1; i <n; i++) {
            r=n%10;
            b=b*10+r;
            n=n/10;
        }
        return b;
    }
       
    
}
