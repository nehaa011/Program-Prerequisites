import java.util.*;
public class self_program03 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter base:");
        int m = sc.nextInt();

        System.out.println("enter exponent:");
        int n = sc.nextInt();

        int power= (int)Math.pow(m,n);
        System.out.println("power calculation is:" + power);
    }
        
}
