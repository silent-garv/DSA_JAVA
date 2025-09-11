import java.util.*;
public class CheckPrime {
    public static boolean isPrime (int n ){
           if (n < 2){
                return false;
           }
           int i = 2 ;
           while(i <= Math.sqrt(n) ){
                if (n % i == 0){
                     return false ;
                }
                i++;
           }
           return true;
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter two values:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (a <= 0 || b <= 0  || a > b ){
                System.out.println("Invalid Input");
                return ;
            }

            for (int num = a ; num <= b ; num ++){
                if (isPrime(num)){
                    System.out.println(num + "  ");
                }
            }
    }
}
