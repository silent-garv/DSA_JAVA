import java.util.*;
public class calculater {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("select the operation to be performed :");
        int operator = sc.nextInt();
        switch (operator) {
            case 1:
            System.out.println("The sum of no:"+(a+b));
            break;

            case 2:
            System.out.println("The difference of no:"+(a-b));
            break;

            case 3:
            System.out.println("The product of no:"+(a*b));
            break;

            case 4:
            System.out.println("The division of no:"+(a/b));
            break;

            default:
            System.out.println("Invalid input");
        }
    }
}
