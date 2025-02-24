// sum of first n natrel no //
import java.util.*;
public class question_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        int sum = 0 ;
        for (int i = 1 ; i <= n; i++){
         sum = sum + i;
        }
        System.out.println("The sum of n natural no:"+ sum);
    }
}
