import java.util.Scanner;

public class self_program02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of rectangle:");
        int length = sc.nextInt();

        System.out.println("Enter width of rectangle:");
        int width = sc.nextInt();

        int perimeter = 2* (length + width);
        System.out.println("perimeter of Rectangle:" + perimeter);
        
    }
    
}
