import java.util.*;
public class pattern_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n1:");
        int num1 = sc.nextInt();
        System.out.print("Enter the value of n2:");
        int num2 = sc.nextInt();

        for(int i =1; i<=num1 ; i++){

            for(int j=1 ; j<=num2 ; j++){
                System.out.print("*");
            }
            System.out.println("*");
        }
        
    }
    
}
