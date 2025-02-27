import java.util.*;
public class exe_08{
    public static int powerCalculation (int n , int x){
        int result = 1 ;
        for(int i = 1 ; i <= n ; i++ ){
            result = result * x;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x :");
        int x = sc.nextInt();
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        int result = powerCalculation(n,x);
        System.out.println("The result is :"+result);
    }
}