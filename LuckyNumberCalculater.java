import java.util.*;
public class LuckyNumberCalculater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lucky NUMBER:");
        int carNO = sc.nextInt();

        if ( carNO < 1000 || carNO > 9000 ){
            System.out.println("Invalid Input");
        }
        int sum = 0 ,  num = carNO;
        while(num > 0){
            sum = sum + num % 10;
            num = num / 10 ;
        }
        if( sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0 ){
            System.out.println("Lucky Number");
        }else{
            System.out.println("Unlucky number");
        }
        sc.close();
    }
}
