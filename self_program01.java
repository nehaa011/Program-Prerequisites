import java.util.Scanner;

public class self_program01 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your principle value:");
        int principle = sc.nextInt();

        System.out.println("Enter rate:");
        int rate =  sc.nextInt();

        System.out.println("Enter time period:");
        int time = sc.nextInt();

        int simple_interest = (principle*rate*time) / 100;
        System.out.println("Simple Interest is:" + simple_interest);

    }
}
