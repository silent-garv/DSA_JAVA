import java.util.*;
public class Strings_02 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first name : " );
    String fname = sc.next();
    System.out.print("Enter your last name : " );
    String lname = sc.next();
    String fullName  = fname + " "+lname;
    System.out.println("Your name is : " + fullName);
    sc.close();
    
  }
}
