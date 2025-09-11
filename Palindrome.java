import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int original = num;
        int reversed = 0;

        if(num < 0 ){
            System.out.println("Invalid input");
        }

        while(num > 0 ){
            int digit = num %10;
            reversed = reversed *10 +digit;
            num = num /10;
        }

        if (original == reversed ){
            System.out.println(original +" is palindrome");
        }else{
            System.out.println(original+"is not a palindrome");

       } 

    }
}
