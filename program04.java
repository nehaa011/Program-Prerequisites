import java.util.*;
public class program04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int pi = 22/7;
        int area = pi *(radius^2);
        System.out.println("Area of Circle is:" + area);
    }
}
