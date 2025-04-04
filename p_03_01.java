import java.util.*;
public class p_03_01 {
    public static void main(String[] args) {
        // problem 1
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Your name is: " + name);
        System.out.println("your name in Lower case is:"+name.toLowerCase());
        
        //problem 02
        String text = "To lower case oyy guru ji";
        text = text.replace(" " , "_");
        System.out.println(text);

        //problem 03
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", name);
        System.out.println(letter);

        //problem 04
        String mtString = "THis   String  vontain double   and  triple spaces ";
        System.out.println(mtString.indexOf("  "));
        System.out.println(mtString.indexOf("   "));

        //problem 05
        String myLetter = "Dear garv,\n\t This learning is cool.\n\t Thanks!.";
        System.out.println(myLetter);





    }
}
