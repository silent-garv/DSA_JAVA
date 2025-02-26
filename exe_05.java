import java.util.*;
public class exe_05 {
    public static int   eligibility(int age){
        if(age>= 18){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age  = sc.nextInt();
        if(eligibility(age)==1){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
