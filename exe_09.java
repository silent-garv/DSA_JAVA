import java.util.*;
public class exe_09 {
    public static int gcdCalculator(int n1, int n2){
        while(n1 != n2){
            if(n1 > n2 ){
                n1 = n1- n2 ;
            }else{
                n2 = n2 - n1;
            }
        }
        return n1 ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int n1 = sc.nextInt();

        System.out.print("Enter the second number:");
        int n2 = sc. nextInt();

        int gcd = gcdCalculator(n1,n2);
        System.out.println("The gcd of the two numbers is :"+gcd);
        
    }
}