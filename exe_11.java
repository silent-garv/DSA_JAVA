import java.util.*;
public class exe_11 {
    public static int sumOFN (int n){
        int sum = 0 ;
        for(int i = 1 ; i<=n ; i++){
            sum = sum + i ;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sumOFN(n));
    }
}
