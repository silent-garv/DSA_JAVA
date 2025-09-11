import java.util.*;
public class TheaterBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no of pizzas:");
        int p = sc.nextInt();

        System.out.print("Enter the no of puffs :");
        int pu = sc.nextInt();

        System.out.print("Enter the no of cool Deinks :");
        int cd = sc.nextInt();


        System.out.print("Bill Details:");
        System.out.println("No of pizzas :"+p);
        System.out.println("No of puffs :"+pu);
        System.out.println("No of cool Deinks :"+cd);

        int total = p*100 + pu*20 + cd*10 ;
        System.out.print("The total bil is :" + total);
    }
}
