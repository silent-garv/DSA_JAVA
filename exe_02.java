import java.util.*;
public class exe_02 {
    public static  int   calculateOddSum(int n){
        int sum = 0 ;
        for(int i = 1; i<= n ; i+=2){
            sum += i;
        }
        return sum ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("The sum of the first n odd no is :"+calculateOddSum(n));
    }
}
