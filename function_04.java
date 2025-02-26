import java.util.*;
public class function_04 {
    public static void calculateFactorial(int n ){
        int fact =1;
        if(n < 0){
            System.out.println("INVALID INPUT");
            return;
        }
        for(int i = n ; i>= 1 ; i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        calculateFactorial(n);
    }
}
