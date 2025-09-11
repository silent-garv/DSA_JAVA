import java.util.*;
public class IncrementCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary:");
        int salary = sc.nextInt();

        System.out.print("Enter your rating:");
        double rating = sc.nextDouble();

        if(salary <= 0 ||  rating < 1 || rating > 5 ){
            System.out.println("Invalid input");
        }else {

            double increasedSalary = 0 ;
            if (rating >= 1 ||  rating <= 3){
                increasedSalary = salary + (salary *(0.10));
            }else if( rating > 3 || rating <= 4){
                increasedSalary = salary + (salary*(0.25));
            }else if ( rating >4 || rating <= 5){
                increasedSalary = salary + (salary*(0.30));
            }
            System.out.println("Output:"+(int)increasedSalary);
        }
        sc.close();
    }
}
