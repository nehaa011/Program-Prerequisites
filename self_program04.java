import java.util.*;
public class self_program04 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("enter 1st number:");
        int x= sc.nextInt();

        System.out.println("enter 2nd number:");
        int y= sc.nextInt();

        System.out.println("enter 3rd number:");
        int z= sc.nextInt();

        int avg= (x+y+z)/3;
        System.out.println("Average of three number is:" +avg);
    }
}
