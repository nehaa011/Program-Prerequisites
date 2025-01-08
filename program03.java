import java.util.*;
public class program03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        int fahrenhiet = (celsius * 9/5) + 32;
        System.out.println("Fahrenhiet is:" + fahrenhiet);
    }
}