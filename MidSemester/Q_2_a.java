package MidSemester;

public class Q_2_a {
    public static void main(String[] args) {
        System.out.println("Enter two number: ");
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        if(a%b==0){
            System.out.println(a+" is divisible by "+b+": True");
        }else if(b%a==0){
            System.out.println(a+" is not divisible by "+b+" but "+b+" is divisible by "+a);
        }else{
            System.out.println(a+"is not divisible by "+b+" and "+b+" is also not divisible by "+a+":False");
        }
    }
    
}
