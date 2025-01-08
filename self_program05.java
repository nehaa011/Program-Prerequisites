import java.util.*;
public class self_program05 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter distacnce in kilometers:");
        double kilometer = sc.nextInt();

        double miles= kilometer  * 0.621371;
        System.out.println("distance is: "+ miles +" miles");

    }
}
