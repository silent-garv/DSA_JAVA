import java.util.*;
public class Three_no_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the numbers to add:");
        int a  = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int result  = a+b+c;
        System.out.println("The sum of three numbers is :"+result);
        sc.close();


    }
}
