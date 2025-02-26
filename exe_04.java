import java.util.*;
public class exe_04 {
    public static double calculateCircumference(double r){
        return 2*3.14*r;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println("The circumference of the circle is :"+calculateCircumference(r));
    }
}
