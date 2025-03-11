import java.util.*;
public class p_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the kilometers to convert:");
        float km = sc.nextFloat();
        float miles = 0.62137119f;
        float miles_result = km *miles ;
        System.out.println("The miles is :"+miles_result);
        

    }
}
