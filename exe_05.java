import java.util.*;
public class exe_05 {
    public static void eligibility (int age){
        if(age>= 18){
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        eligibility(age);
    }
}
