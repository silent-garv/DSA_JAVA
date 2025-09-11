import java.util.*;
public class MaximumPLaced {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the no of placed students in CSE:");
         int cse = sc.nextInt();
         System.out.print("Enter the no of placed students in ECE:");
         int ece = sc.nextInt();
         System.out.print("Enter the no of placed students in MECH:");
        int mech = sc.nextInt();
        if(cse<0 || ece<0 || mech<0){
            System.out.print("Input is Invalid");
            
        }else{

        if (cse >ece && cse > mech){
            System.out.println ("Highest Placement:");
	        System.out.println ("CSE");
	        
        }else if (ece > cse && ece > mech){
            System.out.println ("Highest Placement:");
            System.out.println ("ECE");
                   
        }else if (mech > cse && mech > ece){
            System.out.println ("Highest Placement:");
            System.out.println ("MECH");
        }   else if (cse == ece && cse > mech){
            System.out.println ("Highest Placement:");
            System.out.println("CSE");
            System.out.print("ECE");
        }else if (cse == mech && cse > ece){
           System.out.println ("Highest Placement:");
           System.out.println("CSE");
           System.out.print("MECH");
        }else if (ece == mech && ece > cse){
           System.out.println ("Highest Placement:");
           System.out.println("ECE");
           System.out.print("MECH");
        }
        else if(cse == 0 && ece == 0 && mech == 0){
            System.out.print("No department has got the highest placement");
            
    }
         sc.close();

}
    }
}
