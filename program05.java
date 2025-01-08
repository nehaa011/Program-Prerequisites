import java.util.*;
public class program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int height = sc.nextInt();
        int pi = 22/7;
        int volume = pi * (radius^2) * height;
        System.out.println("Volume of Cylinder is:" + volume);
    }
}
