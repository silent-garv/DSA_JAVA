import java.util.*;
public class Strings_03 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first name : " );
    String fullname = sc.next();
    System.out.print("Enter your last name : " );
    String lastname = sc.next();
    String fullName  = fullname + " "+lastname;
    System.out.println("Your name length is : " + fullName.length());
    sc.close();
  }
}
