import java.util.*;
public class FuelConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Liters of fuel consumed:");
        double Liters = sc.nextDouble();

        System.out.print("Enter the distance traveled:");
        double distance = sc.nextDouble();


        if( Liters <=0 || distance <= 0 ){
            System.out.println("Invalid output values must be non zero and positive.");
        }

        double per100km = (Liters /distance)*100;
        double gallons = Liters * 0.2642;
        double miles = distance * 0.6214;
        double mgp = miles/gallons;

        System.out.printf("Liters per 100 km\n%.2f\n",per100km);
        System.out.printf("Miles per gallon \n%.2f\n",mgp);
    }
    
}
